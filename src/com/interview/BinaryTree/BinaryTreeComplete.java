package com.interview.BinaryTree;

public class BinaryTreeComplete {
	
	static boolean isCompleteBT(Node root)
	{
		return true;
	}
	
	int height(Node node)
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

}
