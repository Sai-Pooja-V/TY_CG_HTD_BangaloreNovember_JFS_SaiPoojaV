package com.cg.collectionInterface.linkedList;

import java.util.LinkedList;

public class Methods2 {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(56);
		l1.add(68);
		l1.add(36);
		l1.add(78);
		System.out.println("L1 list: "+l1);
		
		System.out.println("peek(): "+l1.peek());
		System.out.println("peekFirst(): "+l1.peekFirst());
		System.out.println("peekLast(): "+l1.peekLast());
		System.out.println("L1 list: "+l1);
		System.out.println("-------------------------------");
		System.out.println("poll(): "+l1.poll());
		System.out.println("L1 list: "+l1);
		System.out.println("pollFirst(): "+l1.pollFirst());
		System.out.println("L1 list: "+l1);
		System.out.println("pollLast(): "+l1.pollLast());
		System.out.println("L1 list: "+l1);
		System.out.println("---------------------------------");
		
		LinkedList l2 = new LinkedList();
		l2.add(23);
		l2.add(97);
		l2.add(67);
		l2.add(56);
		System.out.println("L2 list: "+l2);
		l2.offer(23);
		System.out.println("L2 list offer(23): "+l2);
		l2.offerLast(78);
		System.out.println("L2 list offerLast(78): "+l2);
		l2.offerFirst(02);
		System.out.println("L2 list offerFirst(02): "+l2);
		System.out.println("---------------------------------");
		
		LinkedList l3 = new LinkedList();
		l3.add(23);
		l3.add(34);
		l3.add(87);
		l3.add(34);
		System.out.println("L3 List: "+l3);
		l3.push(90);
		System.out.println("push(90): "+l3);
		l3.pop();
		System.out.println("pop(): "+l3);
		System.out.println("element(): "+l3.element());
		System.out.println("L3 List: "+l3);
	}
}
