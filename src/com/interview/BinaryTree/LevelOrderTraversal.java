package com.interview.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	
	static int height(Node node)
	{
		if(node == null)
			return 0;
		else 
		{
			int lheight = height(node.getLeftchild());
			int rheigth = height(node.getRightChild());
			
			int height = Math.max(lheight, rheigth)+1;
			return height;
		}		
	}
	
	static void printGivenLevel(Node root)
	{
		int height = height(root);
		for(int i =1; i< height;i++)
		{
			printgivenode(root,i);
		}
	}

	private static void printgivenode(Node root,int height) {
		if(root == null)
			return;
		if(height == 1)
			System.out.println(root.getData());
		else if(height > 1)
			printgivenode(root.getLeftchild(), height-1);
			printgivenode(root.getRightChild(), height-1);
		
	}
	
	private static void printUsingQueues(Node root)
	{
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			Node node = queue.poll();
			System.out.println(node.getData());
			if(node.getLeftchild() != null)
			{
				queue.add(node.getLeftchild());
			}
			if(node.getRightChild() != null)
			{
				queue.add(node.getRightChild());
			}
		}
	}
}
