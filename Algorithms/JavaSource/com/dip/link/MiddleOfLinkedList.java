package com.dip.link;

public class MiddleOfLinkedList {

	public static void main(String args[]) {

		LinkedList l = new LinkedList();
		l.push(2);
		l.push(21);
		l.push(12);
		l.push(3);
		l.push(31);
		l.push(13);

		l.print();

		int mid = l.getMiddle();
		System.out.println("\n Middle Element -> " + mid);
	}
}

class LinkedList {

	Node head;

	class Node {

		int data;
		Node next;

		Node(int d) {
			this.data = d;
			next = null;
		}
	}

	protected int getMiddle() {

		Node slowPtr = head;
		Node fastPtr = head;
		if (head != null) {
			while (fastPtr.next != null && fastPtr.next.next != null) {
				slowPtr = slowPtr.next;
				fastPtr = fastPtr.next.next;
			}
		}

		return slowPtr.data;
	}

	protected void push(int data) {

		Node node = new Node(data);
		node.next = head;
		head = node;

	}

	protected void print() {

		Node ptr = head;

		System.out.print(" \n Linked List -> ");

		while (ptr != null) {
			System.out.print(" " + ptr.data);
			ptr = ptr.next;
		}
	}
}