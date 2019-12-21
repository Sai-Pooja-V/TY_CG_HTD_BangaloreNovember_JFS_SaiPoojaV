package com.cg.map.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
		h1.put(8, "Suresh");
		h1.put(2, "Ramesh");
		h1.put(6, "Ganesh");
		h1.put(4, "Dinesh");
		h1.put(7, "Mahesh");
		h1.put(null, null);
		System.out.println(h1);
		h1.put(34, null);
		System.out.println(h1);
		h1.put(null, "Sai");
		System.out.println(h1);

		Set<Map.Entry<Integer, String>> s1 = h1.entrySet();
		
		for (Map.Entry<Integer, String> e1 : s1) {
			System.out.println(e1.getValue());
			System.out.println(e1.getKey());
			System.out.println("-------------");
		}
		
		System.out.println(h1.containsKey(8));
		System.out.println(h1.containsValue("Dinesh"));
	}
}
