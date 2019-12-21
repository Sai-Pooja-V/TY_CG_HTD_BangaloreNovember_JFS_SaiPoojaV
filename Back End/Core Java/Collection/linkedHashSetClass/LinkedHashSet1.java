package com.cg.collectionInterface.linkedHashSetClass;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	public static void main(String[] args) {
		LinkedHashSet l1 = new LinkedHashSet();
		l1.add(23);
		l1.add(78);
		l1.add(72);
		l1.add(78);
		l1.add(null);
		
		Iterator itr = l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("------------");
		
		LinkedHashSet<Integer> l2 = new LinkedHashSet<Integer>();
		l2.add(90);
		l2.add(23);
		l2.add(34);
		l2.add(23);
		l2.add(null);
		
		Iterator<Integer> itr1 = l2.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}
