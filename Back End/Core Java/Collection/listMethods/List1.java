package com.cg.collectionInterface.listMethods;

import java.util.*;

public class List1 {
	public static void main(String[] args) {
		List l1 = new ArrayList();
		l1.add(0, 10);
		l1.add(1, 20);
		l1.add(2, 30);
		l1.add(3, 40);
		//l1.add(5, 90); //exception - we should add elements in order 
		l1.add(1, 110);
		System.out.println("list elements: "+l1);
		
		l1.remove(1);
		System.out.println("After removing 110: "+l1);
		System.out.println("indexOf(20): "+l1.indexOf(20));
		l1.add(20);
		System.out.println("list elements: "+l1);
		System.out.println("lastIndexOf(20): "+l1.lastIndexOf(20));
		System.out.println("-----get method-----");
		for(int i = 0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		
		System.out.println("-----addAll method-----");
		List l2 = new ArrayList();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(40);
		System.out.println("l2 "+l2);
		List l3 = new ArrayList();
		l3.add(90);
		l3.add(50);
		l3.add(70);
		System.out.println("l3 "+l3);
		l2.addAll(1, l3);
		System.out.println(l2);
		
		System.out.println("----set method------");
		List l4 = new ArrayList();
		l4.add(90);
		l4.add(50);
		l4.add(70);
		System.out.println(l4);
		l4.set(1, 300);
		System.out.println(l4);
		
		System.out.println("----subList method------");
		List l5 = new ArrayList();
		l5.add(90);
		l5.add(50);
		l5.add(70);
		System.out.println("l5 "+l5);
		
		List l6 = l5.subList(0, 2);
		System.out.println("l6 "+l6);
	}
}
