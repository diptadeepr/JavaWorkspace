package com.dip.link;

import java.util.Stack;

public class LinkedListOperations {
	public static void main(String args[]) {
		SinglyLinkedList l = new SinglyLinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);

		l.print();

		l.add(40, 44); // add 44 after 40
		l.add(60, 66); // add 66 after 60
		l.add(100, 111); // add 111 after 100 - which does not exist
		l.add(10, 11); // at the end
		l.add(70); // add at the beginning
		l.print();

		l.remove(55); // remove 55 - which does not exist
		l.remove(66); // remove 66
		l.print();

		l.reverse(); // reverse a linked list
		l.print();

	}
}

class _Node {
	_Node next;
	int data;

	_Node(int data) {
		this.data = data;
	}
}

class SinglyLinkedList {
	_Node head;

	SinglyLinkedList() {
		head = null;
	}

	void add(int data) {
		_Node node = new _Node(data);
		node.next = head;
		head = node;
	}

	void add(int sdata, int ndata) {
		_Node ptr = head;
		boolean found = false;

		while (ptr != null) {
			if (ptr.data == sdata) {
				found = true;
				break;
			}
			ptr = ptr.next;
		}
		if (found) {
			_Node node = new _Node(ndata);
			_Node nptr = ptr.next;
			ptr.next = node;
			node.next = nptr;
		}
	}

	void remove(int ddata) {
		_Node ptr = head;
		_Node prev_ptr = head;
		boolean found = false;

		while (ptr != null) {
			if (ptr.data == ddata) {
				found = true;
				break;
			}
			prev_ptr = ptr;
			ptr = ptr.next;
		}

		if (found)
			prev_ptr.next = ptr.next;
	}

	void reverse() {
		_Node ptr = head;
		Stack<_Node> stack = new Stack<_Node>();
		while (ptr != null) {
			stack.push(ptr);
			ptr = ptr.next;
		}
		_Node curr_ptr = null;
		if (!stack.isEmpty()) {
			curr_ptr = stack.pop();
			head = curr_ptr;
		}
		while (!stack.isEmpty()) {
			_Node prev_ptr = stack.pop();

			curr_ptr.next = prev_ptr;
			curr_ptr = curr_ptr.next;
		}
		curr_ptr.next = null;
	}

	void print() {
		_Node ptr = head;
		System.out.println("\n");
		while (ptr != null) {
			process(ptr);
			ptr = ptr.next;
		}
	}

	void process(_Node node) {
		System.out.print(" -> " + node.data);
	}
}