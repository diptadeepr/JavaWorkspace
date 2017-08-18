package com.dip.tree;

public class Tree {

	public Node root;

	public Tree() {
		root = null;
	}

	public void printInorder() {
		printInorder(root);
	}

	private void printInorder(Node node) {

		if (node == null) {
			return;
		}

		printInorder(node.left);
		System.out.print(" -> " + node.data);
		printInorder(node.right);
	}

	public void printPostOrder() {
		printPostOrder(root);
	}

	private void printPostOrder(Node node) {

		if (node == null) {
			return;
		}

		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.print(" -> " + node.data);
	}

	public void printPreOrder() {
		printPreOrder(root);
	}

	private void printPreOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(" -> " + node.data);
		printPreOrder(node.left);
		printPreOrder(node.right);
	}
}
