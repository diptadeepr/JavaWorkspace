package com.dip.tree.level;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	public static void main(String args[]) {
		Tree tree = new Tree(10);
		tree.add(7);
		tree.add(12);
		tree.add(5);
		tree.add(8);
		tree.add(11);
		tree.add(14);

		tree.printInOrder();
		System.out.println("");
		tree.printLevelOrder();
	}
}

class Node {
	Node left, right;
	int data;

	Node(int data) {
		this.data = data;
	}

	void add(int data) {
		if (data < this.data) {
			if (left == null) {
				left = new Node(data);
			} else {
				left.add(data);
			}
		} else {
			if (right == null) {
				right = new Node(data);
			} else {
				right.add(data);
			}
		}
	}
}

class Tree {

	Node root;

	Tree() {
		root = null;
	}

	Tree(int data) {
		root = new Node(data);
	}

	void add(int data) {
		root.add(data);
	}

	void printInOrder() {
		printInOrder(root);
	}

	void printInOrder(Node node) {
		if (node == null)
			return;

		printInOrder(node.left);
		processNode(node);
		printInOrder(node.right);
	}

	void printLevelOrder() {
		printLevelOrder(root);
	}

	void printLevelOrder(Node node) {

		Queue<Node> queue = new LinkedList<Node>();

		queue.add(node);
		Node tmp_node;

		while (queue.size() > 0) {

			tmp_node = queue.poll();

			processNode(tmp_node);
			if (tmp_node.left != null)
				queue.add(tmp_node.left);
			if (tmp_node.right != null)
				queue.add(tmp_node.right);
		}
	}

	void processNode(Node node) {
		System.out.print(" -> " + node.data);
	}
}
