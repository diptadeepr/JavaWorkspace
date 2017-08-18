package com.dip.link;

public class RemoveLoopInLinkList {
	public static void main(String args[]) {
		LoopedLinkedList l = new LoopedLinkedList();

		l.head = new Node_(1);
		l.head.next = new Node_(2);
		//l.head.next.next = l.head;
		l.head.next.next = new Node_(3);
		l.head.next.next.next = new Node_(4);
		l.head.next.next.next.next = new Node_(5);
		l.head.next.next.next.next.next = new Node_(6);
		l.head.next.next.next.next.next.next = new Node_(7);
		l.head.next.next.next.next.next.next.next = l.head.next.next.next;

		// l.print();
		System.out.println("Linked List has loop -> " + l.hasLoop());
		l.removeLoop();
		l.print();
	}
}

class Node_ {
	Node_ next;
	int data;

	Node_(int data) {
		this.data = data;
	}
}

class LoopedLinkedList {
	Node_ head;

	LoopedLinkedList() {
		head = null;
	}

	void print() {
		Node_ ptr = head;
		while (ptr != null) {
			process(ptr);
			ptr = ptr.next;
		}
	}

	void process(Node_ node) {
		System.out.print(" -> " + node.data);
	}

	boolean hasLoop() {
		
		if(head.next == null || head.next.next == null) {
			return false;
		}
		
		Node_ slow_ptr = head.next;
		Node_ fast_ptr = head.next.next;
		boolean loop = false;
		
		while (slow_ptr != fast_ptr) {
			if (fast_ptr.next != null && fast_ptr.next.next != null) {
				slow_ptr = slow_ptr.next;
				fast_ptr = fast_ptr.next.next;
			}
		}

		if (slow_ptr == fast_ptr) {
			loop = true;
		}
		return loop;
	}

	void removeLoop() {
		
		if(head.next == null || head.next.next == null) {
			return;
		}
		
		if(head.next.next == head) {
			head.next.next = null;
			return;
		}
		
		Node_ slow_ptr = head.next;
		Node_ fast_ptr = head.next.next;

		while (slow_ptr != fast_ptr) {
			if (fast_ptr.next != null && fast_ptr.next.next != null) {
				slow_ptr = slow_ptr.next;
				fast_ptr = fast_ptr.next.next;
			}
		}

		slow_ptr = head;
		Node_ prev_ptr = fast_ptr;

		while (slow_ptr != fast_ptr) {
			slow_ptr = slow_ptr.next;
			prev_ptr = fast_ptr;
			fast_ptr = fast_ptr.next;
		}

		prev_ptr.next = null;
	}
}
