package com.cg.collectionInterface.arrayList;

import java.util.*;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		System.out.println(a1);
		a1.remove(1);
		System.out.println(a1);
		
		//iterating an arraylist using for loop
		System.out.println("----for loop-------");
		for(int i = 0; i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		
		//using for each loop
		System.out.println("-------for each loop--------");
		for (Integer i1 : a1) {
			System.out.println(i1);
		}
		
		//using iterator() method
		System.out.println("-----iterator()-----------");
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(10);
		a2.add(20);
		a2.add(30);
		Iterator<Integer> itr = a2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-------listIterator()----------");
		ListIterator<Integer> itr1 = a2.listIterator(a2.size());
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}
		System.out.println("-----------------");
		ListIterator<Integer> itr3 = a2.listIterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		while(itr3.hasPrevious()) {
			System.out.println(itr3.previous());
		}
		
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(23);
		a3.add(76);
		a3.add(45);
		System.out.println(a3);
		a3.remove(new Integer(23));
		System.out.println(a3);
	}
}
