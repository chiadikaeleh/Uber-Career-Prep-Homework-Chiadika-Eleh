package StacksaAndQueues;

import StacksaAndQueues.Stacks.Node;

public class Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static class Node {
		private int data;
		private Node next;
		
		private Node(int data) {
			this.data = data;
		}
	}
	
	private Node top;
	private Node head;
	private Node tail;
	
	// STACKS
	
	public void push(int data) {
		Node n = new Node(data);
		n.next = top;
		top = n;
	}
	
	public int pop() {
		if (top == null) {
		throw new IllegalStateException("Nothing to pop!");	
		} 
		
		int ans = top.data;
		top = top.next;
		
		return ans;
	}
	
	public int top() {
		return top.data;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public int size() {
		if (top == null) {
			return 0;
		}
		
		Node n = top;
		int size = 1;
		
		while (n.next != null) {
			size++;
			n = n.next;
		}
		
		return size;
	}
	
	// QUEUES
	
	private void enqueue(int data) {
		Node n = new Node(data);
		if (head == null) {
			head = n;
		} 
		
		if (tail != null) {
			tail.next = n;
			tail = n;
		} else {
			tail = n;
		}
	}
	
	private void dequeue() {
		if (head == null) {
			throw new IllegalStateException("Nothing to remove!");	
			} 
		head = head.next;
	}
	
	private int rear() {
		return tail.data;
	}
	
	private int front() {
		return head.data;
	}
	
	private boolean isEmpty() {
		return head == null;
	}

	private int size() {
		if (head == null) {
			return 0;
		}
		
		int size = 1;
		Node n = head;
		
		while (n.next != null) {
			size++;
			n = n.next;
		}
		
		return size;
	}

}
