package com.cg.collectionInterface.collectionMethods;

import java.util.*;

public class CollectionMethods {
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		c.add(12);
		System.out.println("Elements are: "+c);
		c.remove(12);
		System.out.println(c);
		System.out.println("size is "+c.size());
		System.out.println(c.isEmpty());
		System.out.println(c.contains(23.65));
		c.add(23.65);
		System.out.println("Elements are: "+c);
		System.out.println(c.isEmpty());
		System.out.println("size is "+c.size());
		System.out.println(c.contains(23.65));
		
		System.out.println("--------addAll------------");
		Collection c1 = new ArrayList();
		c1.add(10);
		c1.add(20);
		System.out.println("C1 elements: "+c1);
		Collection c2 = new ArrayList();
		c2.add(10);
		c2.add(20);
		System.out.println("C2 elements: "+c2);
		c1.addAll(c2);
		System.out.println("C1 After addAll: "+c1);
		
		System.out.println("--------removeAll------------");
		Collection c3 = new ArrayList();
		c3.add(10);
		c3.add(20);
		c3.add(30);
		System.out.println("C3 elements: "+c3);
		Collection c4 = new ArrayList();
		c4.add(30);
		c4.add(40);
		System.out.println("C4 elements: "+c4);
		c3.removeAll(c4);
		System.out.println("C3 After removeAll: "+c3);
		
		System.out.println("-----------retainAll---------");
		Collection c5 = new ArrayList();
		c5.add(10);
		c5.add(20);
		c5.add(30);
		c5.add(40);
		System.out.println("C5 elements: "+c5);
		Collection c6 = new ArrayList();
		c6.add(10);
		c6.add(20);
		c6.add(90);
		c6.add(80);
		System.out.println("C6 elements: "+c6);
		c5.retainAll(c6);
		System.out.println("C5 After retainAll: "+c5);
		
		System.out.println(c5.containsAll(c5));
		System.out.println("C5 elements: "+c5);
		c5.clear();
		System.out.println("C5 After clear: "+c5);
		
		System.out.println("------toArray----------");
		Collection c7 = new ArrayList();
		c7.add(10);
		c7.add(20);
		c7.add(30);
		c7.add(40);
		
		Object a[] = c7.toArray();
		System.out.println("Array elements are: ");
		for(int i =0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("-----------removeIf-----------");
		Collection c8 = new ArrayList();
		c8.add(10);
		c8.add(20);
		c8.add(30);
		c8.add(40);
		//c8.removeIf(a -> a>2);
		
	}
}
