package com.dip.tree.binary;

public class ConstructBinaryTree {
	public static void main (String args[]) {
		
		Tree tree = new Tree(10);
		tree.add(8);
		tree.add(12);
		tree.add(5);
		tree.add(9);
		
		tree.printInOrder();
	}
}
class Node{
	Node left, right;
	int data;
	Node(int data){
		this.data = data;
	}
	void add(int data) {
		if(data < this.data) {
			if(left == null) {
				left = new Node(data);
			}else {
				left.add(data); 
			}
		}else {
			if(right == null) {
				right = new Node(data);
			}else {
				right.add(data);
			}
		}
	}
}
class Tree{
	Node root;
	
	Tree(int data){
		root = new Node(10);
	}
	
	void add(int data) {
		root.add(data);
	}
	
	void printInOrder(){
		printInOrder(root);
	}
	
	void printInOrder(Node node) {
		if(node == null) {
			return;
		}
		printInOrder(node.left);
		System.out.print(" -> " + node.data);
		printInOrder(node.right);
	}
}