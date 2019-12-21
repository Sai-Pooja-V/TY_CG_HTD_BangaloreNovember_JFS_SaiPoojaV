package com.cg.map.treeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestStudent {
	public static void main(String[] args) {
		StudentName s1  = new StudentName();
		TreeMap<Student, String> t1 = new TreeMap<Student, String>(s1);
		
		t1.put(new Student("Shree",15),"9th standard");
		t1.put(new Student("Anu",18),"12th standard");
		t1.put(new Student("Divya",10),"6th standard");
		
		Set<Map.Entry<Student,String>> set = t1.entrySet();
		
		for (Map.Entry<Student, String> e1 : set) {
			System.out.println(e1.getValue());
			System.out.println(e1.getKey());
			System.out.println("----------------");
		}
	}
}
