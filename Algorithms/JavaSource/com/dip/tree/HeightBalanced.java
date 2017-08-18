package com.dip.tree;

public class HeightBalanced {
	public static void main(String args[]) {
		
		Tree tree = new HightBalancedTree();
		tree.root = new Node(50);
		tree.root.left = new Node(20);
		tree.root.right = new Node(30);
		
		tree.root.left.left = new Node(8);
		tree.root.left.right = new Node(12);
		
		tree.root.right.left = new Node(14);
		tree.root.right.right = new Node(16);
		
		tree.root.right.right.left = new Node(7);
		tree.root.right.right.right = new Node(9);
		
		tree.root.right.right.right.left = new Node(3);
		tree.root.right.right.right.right = new Node(4);
		
		tree.printInorder();
		
		HightBalancedTree hbtree = new HightBalancedTree();
		boolean result = hbtree.isBalanced(tree.root);
		System.out.println("\n" + result);
	}
}
class HightBalancedTree extends Tree{
	
	HightBalancedTree(){
		super();
	}
	
	boolean isBalanced(Node node) {
		
		if(node == null) 
			return true;
		
		int lt = height(node.left);
		int rt = height(node.right);
		
		if((lt - 1) == rt || (rt - 1) == lt || lt == rt) {
			return true;
		}
		
		return false;
	}
	int height(Node node) {
		
		if(node.left == null)
		  return 0;
		
		return 1+ Math.max(height(node.left), height(node.right));
	}
}