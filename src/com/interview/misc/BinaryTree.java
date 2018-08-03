package com.interview.Misc;

//Java implementation of an O(n) approach of level order
//traversal in spiral form

import java.util.*;;;

//A Binary Tree node
class Node 
{
	int data;
	Node left, right;

	public Node(int item) 
	{
		data = item;
		left = right = null;
	}
}

class BinaryTree 
{

	static Node root;

	void printSpiral(Node node) 
	{
		if (node == null) 
			return; // NULL check

		// Create two stacks to store alternate levels
		Queue<Node> s1 = new LinkedList<Node>();// For levels to be printed from right to left
		Queue<Node> s2 = new LinkedList<Node>();// For levels to be printed from left to right

		// Push first level to first stack 's1'
		s1.add(node);

		// Keep ptinting while any of the stacks has some nodes
		while (!s1.isEmpty() || !s2.isEmpty()) 
		{
			// Print nodes of current level from s1 and push nodes of
			// next level to s2
			while (!s1.isEmpty()) 
			{
				Node temp = s1.peek();
				s1.remove();
				System.out.print(temp.data + " ");

				// Note that is right is pushed before left
				if (temp.right != null) 
					s1.add(temp.right);
				
				if (temp.left != null) 
					s1.add(temp.left);
				
			}

			// Print nodes of current level from s2 and push nodes of
			// next level to s1
//			while (!s2.empty()) 
//			{
//				Node temp = s2.peek();
//				s2.pop();
//				System.out.print(temp.data + " ");

//				// Note that is left is pushed before right
//				if (temp.left != null)
//					s1.push(temp.left);
//				if (temp.right != null)
//					s1.push(temp.right);
//			}
		}
	}

	public static void main(String[] args) 
	{
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(7);
		tree.root.left.right = new Node(6);
		tree.root.right.left = new Node(5);
		tree.root.right.right = new Node(4);
		System.out.println("Spiral Order traversal of Binary Tree is ");
		tree.printSpiral(root);
	}
}

//This code has been contributed by Mayank Jaiswal(mayank_24)
