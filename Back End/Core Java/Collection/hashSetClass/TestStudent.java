package com.cg.collectionInterface.hashSetClass;

import java.util.HashSet;

public class TestStudent {
	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<Student>();
		hs.add(new Student("Sai", 22));
		hs.add(new Student("Pooja", 24));
		hs.add(new Student("Jyothi", 23));
		hs.add(new Student("Pooja", 24));
		
		for (Student s : hs) {
			System.out.println(s.studeAge + " and "+s.studName);
		}
	}
}
