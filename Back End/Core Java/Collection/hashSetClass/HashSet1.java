package com.cg.collectionInterface.hashSetClass;

import java.util.HashSet;

public class HashSet1 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(23);
		hs.add(67);
		hs.add(98);
		hs.add(34);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		
		
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("Hello");
		hs1.add("World");
		hs1.add("Welcome");
		hs1.add(null);
		for (Object object : hs1) {
			System.out.println(object);
		}
	}
}
