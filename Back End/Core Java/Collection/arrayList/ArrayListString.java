package com.cg.collectionInterface.arrayList;

import java.util.ArrayList;

public class ArrayListString {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Hello");
		a1.add("Hi");
		a1.add("World");
		a1.add("Welcome");
		System.out.println("a1 elements: "+a1); 
		
		a1.add(1, "Hiiiii");
		System.out.println("a1 elements: "+a1); 
		a1.remove(1);
		System.out.println("a1 elements: "+a1); 
		a1.remove("Hi");
		System.out.println("a1 elements: "+a1); 
		System.out.println("contains(\"World\"): "+a1.contains("World"));
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("Sai");
		a2.add("Pooja");
		a2.add("Jyothi");
		a2.add("Navya");
		System.out.println("a2 elements: "+a2); 
//		a1.addAll(a2);
//		System.out.println("after addAll: "+a1);
		a1.addAll(2, a2);
		System.out.println("After addAll: "+a1);
		a1.clear();
		System.out.println("a1 elements: "+a1);
		
		ArrayList<String> a3 = new ArrayList<String>();
		a3.add("Sai");
		a3.add("Pooja");
		a3.add("Jyothi");
		a3.add("Navya");
		System.out.println("a3 elements: "+a3); 
		ArrayList<String> a4 = new ArrayList<String>();
		a4.add("a");
		a4.add("b");
		a4.add("c");
		a4.add("d");
		System.out.println("a4 elements: "+a4); 
		a3.addAll(a4);
		System.out.println(a3);
		System.out.println("a3.containsAll(a4): "+a3.containsAll(a4));
	}
}
