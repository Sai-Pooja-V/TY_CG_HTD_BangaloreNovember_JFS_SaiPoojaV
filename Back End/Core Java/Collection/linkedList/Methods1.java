package com.cg.collectionInterface.linkedList;

import java.util.LinkedList;

public class Methods1 {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(23);
		l1.add(34);
		l1.add(76);
		System.out.println("L1 List: "+l1);
		l1.addFirst(54);
		System.out.println("addFirst(54): "+l1);
		l1.removeFirst();
		System.out.println("removeFirst(): "+l1);
		l1.addLast(78);
		System.out.println("addLast(78): "+l1);
		l1.removeLast();
		System.out.println("removeLast(): "+l1);
		
		LinkedList l2 = new LinkedList();
		l2.add(23);
		l2.add(76);
		l2.add(97);
		l2.add(76);
		l2.add(97);
		System.out.println("L2 List: "+l2);
		System.out.println("getFirst(): "+l2.getFirst());
		System.out.println("getLast(): "+l2.getLast());
		l2.removeFirstOccurrence(76);
		l2.removeLastOccurrence(97);
		System.out.println(l2);
	}
}
