package com.interview.BinaryTree;

public class BinaryTree {
	
	Node root;
	
	public void insert(int data)
	{
		if(root == null)
		{
			root = new Node(data);
		}
		else
		{
			insertNode(data,root);
		}
	}
	
	public int getMax()
	{
		Node node = root;
		while(node.getRightChild() != null)
		{
			node = node.getRightChild();
		}
		return node.data;
	}
	
	public void inOrderTraversal(Node node)
	{
		if(node.getLeftchild() != null)
			inOrderTraversal(node.getLeftchild());
		System.out.println(node);
		if(node.getRightChild() != null)
			inOrderTraversal(node.getRightChild());
	}
	
	
	public int getMin()
	{
		Node node = root;
		while(node.getLeftchild() != null)
		{
			node = node.getLeftchild();
		}
		return node.data;
	}
	
	public Node delete(int data,Node node)
	{
		if(node == null)
		{
			return node;
		}
		if(data <  node.getData())
			node.setLeftchild(node.getLeftchild());
		else if(data > node.getData())
			node.setRightChild(node.getRightChild());
		else
			if(node.getLeftchild() == null && node.getRightChild() == null)
				return null;
			 if(node.getLeftchild() == null)
			{
				Node rightnode = node.getRightChild();
				node = null;
				return rightnode;
			}
			 if(node.getRightChild() == null)
			 {
				 Node leftnode = node.getLeftchild();
				 node = null;
				 return leftnode;
			 }
			 Node preNode = predecessor(node.getLeftchild());
			 node.setData(preNode.getData());
			 node = null;
			 return preNode;
	}
	
	public Node predecessor(Node node)
	{
		while(node.getRightChild() != null)
		{
			node= node.getRightChild();
		}
		return node;
	}

	private void insertNode(int data, Node node) {
		
			if(data < node.getData())
			{
				if(node.getLeftchild() != null)
				{
				insertNode(data, node.getLeftchild());
				}else
				{
					Node newnode = new Node(data);
					node.setLeftchild(newnode);
				}
			}
			if(node.getRightChild() != null && data < node.getData())
			{
				if(node.getRightChild() != null)
				{
					insertNode(data, node.getRightChild());
				}else
				{
					Node newnode = new Node(data);
					node.setRightChild(newnode);
				}
				
			}
			
	}
	

}
