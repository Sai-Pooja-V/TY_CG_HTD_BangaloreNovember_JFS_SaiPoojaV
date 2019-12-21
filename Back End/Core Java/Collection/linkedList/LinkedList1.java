package com.cg.collectionInterface.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(23);
		l1.add(45);
		l1.add(12);
		
		ListIterator lt = l1.listIterator();
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
		l1.add(23);
		l1.add(78);
		System.out.println(l1);
		l1.remove(new Integer(23));
		System.out.println(l1);
		l1.add(null);
		System.out.println(l1);
		System.out.println("------for each loop------");
		for (Object i1 : l1) {
			System.out.println(i1);
		}
		System.out.println("----for loop-------");
		for(int i = 0; i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		l1.add(2, 38);
		System.out.println(l1);
	}
}
