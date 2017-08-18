package com.dip.tree;

public class SumTree {
	public static void main(String args[]) {

		BinarySumTree tree = new BinarySumTree();

		tree.root = new Node(50);
		tree.root.left = new Node(20);
		tree.root.right = new Node(30);

		tree.root.left.left = new Node(8);
		tree.root.left.right = new Node(12);

		tree.root.right.left = new Node(14);
		tree.root.right.right = new Node(16);

		boolean result = tree.isSumTree(tree.root);
		System.out.println(result);

	}
}

class BinarySumTree extends Tree {
	boolean isSumTree(Node node) {
		
		boolean result = true;

		if((node.left == null && node.right != null) || 
				(node.left != null && node.right == null)){
			System.out.println("Not a binary tree");
			result = false;
			return result;
		}
			
		if (node == null || node.left == null || node.right == null)
			return result;
		
		if(node.data != sumOfChilNodes(node)) {
			result = false;
		}
        
		if(result)
			result = isSumTree(node.left);
		if(result)
			result = isSumTree(node.right);
		
		return result;
	}
	
	int sumOfChilNodes(Node node) {
		
		if(node.left == null && node.right == null) {
			return node.data;
		} 
		
		return node.left.data + node.right.data;
	}
}