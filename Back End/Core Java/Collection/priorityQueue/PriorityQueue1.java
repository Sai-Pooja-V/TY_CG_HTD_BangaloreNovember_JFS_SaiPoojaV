package com.cg.collectionInterface.priorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {
	public static void main(String[] args) {
		Queue p1 = new PriorityQueue();
		p1.offer(23);
		p1.offer(12);
		p1.offer(2);
		p1.offer(67);
		p1.offer(90);	
		p1.offer(2);
		System.out.println(p1);
		p1.poll();
		p1.poll();
		System.out.println(p1);
		p1.peek();
		System.out.println(p1.peek());
		System.out.println(p1);
		System.out.println(p1.element());
		System.out.println(p1);
		
		for (Object o : p1) {
			System.out.println(o);
		}
	}
}
