package com.cg.collectionInterface.arrayDeque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeque1 {
	public static void main(String[] args) {
		ArrayDeque<String> a1 = new ArrayDeque<String>();
		
		a1.add("Hello");
		a1.add("Hi");
		a1.add("World");
		a1.add("Welcome");
		a1.addFirst("JAVA");
		a1.addLast("SQL");
		System.out.println(a1);
		System.out.println("--------------");
		System.out.println(a1.getFirst());
		System.out.println(a1.getLast());
		System.out.println(a1.isEmpty());
		System.out.println(a1.remove());
		System.out.println(a1.removeFirst());
		System.out.println(a1.removeLast());
//		a1.removeFirstOccurrence("world");
//		System.out.println(a1);
		System.out.println(a1.peek());
		System.out.println(a1.poll());
		System.out.println(a1);
		
		System.out.println("----------");
		Iterator<String> itr = a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
