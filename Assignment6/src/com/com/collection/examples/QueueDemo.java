package com.com.collection.examples;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		for(int i = 10;i>0;i--) {
			queue.add(i);
		}
        // Queue = (Front)10 9 8 7 6 5 4 3 2 1(Rear) 
		// PriorityQueue -> sorts the queue which is the actual queue
		// Queue = (Front)1 2 3 4 5 6 7 8 9 10(Rear)
		
		//Peeking -> obtaining the value of the head
		//Polling -> Removing the value of the head
		System.out.println("Queue size is: "+queue.size());
		System.out.println("Head of the queue is: "+queue.peek());
		queue.poll();	
		System.out.println("Queue size is: "+queue.size());
		System.out.println("Head of the queue is: "+queue.peek());
		
		
	
	}
	 

}
