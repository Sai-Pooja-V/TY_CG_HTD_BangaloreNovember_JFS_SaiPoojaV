package com.cg.collectionInterface.stackList;

import java.util.Stack;

public class StackMethod {
	public static void main(String[] args) {
		Stack s1 = new Stack();
		s1.add(23);
		s1.add(67);
		s1.add(98);
		System.out.println(s1);
		s1.push(78);
		System.out.println(s1);
		
		s1.pop();
		System.out.println(s1);
		
		System.out.println(s1.peek());
		System.out.println(s1);
		
		//search will do in reverse order and it print last element as 1  
		System.out.println(s1.search(new Integer(98)));
		System.out.println(s1);
	}
}
