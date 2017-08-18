package com.dip.link;

public class TraverseCircularLinkedList {
	public static void main(String args[]) {
		CircularLinkedList l = new CircularLinkedList();
	    l.add(10);
	    l.add(20);
	    l.add(30);
	    l.add(40);
	    l.add(50);
	    l.add(60);
	    l.add(70);
	    l.add(80);
	    
		l.print();
		
		l.convertToCircular();
		l.traverseCircular();
	}
}

class Node {

	Node next;
	int data;

	Node(int data) {
		this.data = data;
	}
}

class CircularLinkedList {

	Node head;

	CircularLinkedList(){
		head = null;
	}
	void add(int data) {

		Node node = new Node(data);
		node.next = head;
		head = node;

	}
	void convertToCircular() {
		Node ptr = head;
		while(ptr.next != null) {
			ptr = ptr.next;
		}
		ptr.next = head;
	}
	void traverseCircular() {
		Node ptr = head;
		System.out.println("\n Circular Linked List ");
		while(ptr.next != head) {
			process(ptr);
			ptr = ptr.next;
		}
		process(ptr);
	}
	void print() {
		Node ptr = head;
		
		System.out.println("\n Singly Linked List ");
		
		while(ptr != null) {
			process(ptr);
			ptr = ptr.next;
		}
	}
	void process(Node node) {
		System.out.print(" -> " + node.data);
	}
}