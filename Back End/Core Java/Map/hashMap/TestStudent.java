package com.cg.map.hashMap;

import java.util.Collection;
import java.util.HashMap;

public class TestStudent {
	public static void main(String[] args) {
		HashMap<Integer, Student> h1 = new HashMap<Integer,Student>();
		
		h1.put(34, new Student("Divya",22));
		h1.put(45, new Student("Ramesh",23));
				
		Collection<Student> c1 = h1.values();
		
		for (Student s1 : c1) {
			System.out.println(s1);
		}
		
		System.out.println(h1.containsKey(34));
		System.out.println(h1.containsValue(new Student("Divya",22)));
		
		System.out.println(h1.size());
		System.out.println(h1.isEmpty());
	}
}
