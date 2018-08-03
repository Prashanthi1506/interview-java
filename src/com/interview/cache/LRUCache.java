package com.interview.cache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
	
	private int actualSize = 0;
	private Map<Integer,Node> map;
	private DoublyLinkedlist doublyLinkedlist;
	private int capacity= 4;
	
	public LRUCache() {	
		this.map = new HashMap<>();
		this.doublyLinkedlist = new DoublyLinkedlist();
	}
	
	public void put(int key,int data)
	{
		if(this.map.containsKey(key))
		{
			Node node = this.map.get(key);
			node.setData(data);
			update(node);
			add(node);
			return;
		}
		Node node = new Node(data);
		node.setId(key);
		if(actualSize == this.capacity)
		{
			Node tailNode = this.map.get(this.doublyLinkedlist.getTailNode().getId());
			remove(tailNode);
			add(node);
		}else
		{
			add(node);
		
		}
	}

	private void add(Node node) {
		Node headNode = this.doublyLinkedlist.getHeadNode();
		node.setPrevNode(null);
		node.setNextNode(headNode);
		if(headNode != null)
		{
			headNode.setPrevNode(node);
		}
		this.doublyLinkedlist.setHeadNode(node);
		if(this.doublyLinkedlist.getTailNode() == null)
		{
			this.doublyLinkedlist.setTailNode(node);
		}
		this.map.put(node.getId(), node);
		actualSize++;
	}

	private void remove(Node tailNode) {
		Node prevNode = tailNode.getPrevNode();
		if(prevNode != null)
		{
			prevNode.setNextNode(null);
		}
		this.doublyLinkedlist.setTailNode(prevNode);
		tailNode = null;
		actualSize--;
	
	}

	private void update(Node node) {
		Node prevNode = node.getPrevNode();
		Node nextNode = node.getNextNode();
		
		if(prevNode != null)
		{
			prevNode.setNextNode(nextNode);
		}
		else
		{
			this.doublyLinkedlist.setHeadNode(prevNode);
		}
		if(nextNode != null)
		{
			nextNode.setPrevNode(prevNode);
		}else
		{
			this.doublyLinkedlist.setTailNode(prevNode);
		}
		actualSize--;
		add(node);
		
	}
	
	public Node get(int key)
	{
		if(!this.map.containsKey(key)) 
			return null;
		Node node = this.map.get(key);
		update(node);
		return node;
	}
	
	public void show()
	{
		Node headNode = this.map.get(this.doublyLinkedlist.getHeadNode().getId());
		
		while(headNode != null)
		{
			System.out.println(headNode+"->");
			headNode = headNode.getNextNode();
		}
	}
}
