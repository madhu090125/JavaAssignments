package com.com.collection.examples;
import java.util.*;

public class DequeueDemo {

	public static void main(String[] args) {
		
		Deque <Integer> dq = new ArrayDeque<>();
		dq.add(1);
		dq.addLast(4);
		dq.addFirst(3);
		dq.offerFirst(5);
		System.out.println(dq);
		
		System.out.println(dq.pollFirst());
		System.out.println("Deque after polling the first is:" + dq);
		System.out.println("Head of the dequeue is: "+ dq.peek());
		System.out.println("Head of the first is: "+dq.peekFirst());
		System.out.println("Head of the first is: "+dq.peekLast());
		System.out.println(dq.pollLast());
		System.out.println("Dequeue now is: "+dq);
	}

}
