package com.cg.map.treeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		TreeMap<Integer, String> t1 = new TreeMap<Integer, String>();
		
		t1.put(123, "Sai");
		t1.put(56, "Shree");
		t1.put(78, "Anu");
		
		Set<Map.Entry<Integer,String>> s1 = t1.entrySet();
		
		for (Map.Entry<Integer, String> e1 : s1) {
			System.out.println(e1.getValue());
			System.out.println(e1.getKey());
			System.out.println("----------------");
		}
	}
}
