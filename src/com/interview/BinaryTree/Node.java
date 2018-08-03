package com.interview.BinaryTree;

public class Node {
	
	int data;
	Node leftchild;
	Node rightChild;
	
	Node(int data)
	{
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeftchild() {
		return leftchild;
	}

	public void setLeftchild(Node leftchild) {
		this.leftchild = leftchild;
	}

	public Node getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}
	
	
	
}
