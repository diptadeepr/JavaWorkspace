package com.dip.tree;

public class PrintRightSide {
	public static void main(String args[]) {
		
		PrintRightSideOfTree tree = new PrintRightSideOfTree();
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
		
		System.out.println("");
		
		tree.print(tree.root);
	}
}
class PrintRightSideOfTree extends Tree{
	void print(Node node) {
		if(node == null)
			return;
		System.out.print("-> " + node.data);
		print(node.right);
	}
}
