package com.cg.map.treeMap;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ArrayStudentTest {
	public static void main(String[] args) {
		ArrayList<ArrayStudent> a1 = new ArrayList<ArrayStudent>();
		a1.add(new ArrayStudent("Sai",6));
		a1.add(new ArrayStudent("Pooja",6));
		
		ArrayList<ArrayStudent> a2 = new ArrayList<ArrayStudent>();
		a2.add(new ArrayStudent("Jyothi",7));
		a2.add(new ArrayStudent("Navya",7));
		
		ArrayList<ArrayStudent> a3 = new ArrayList<ArrayStudent>();
		a3.add(new ArrayStudent("Gowtham",8));
		a3.add(new ArrayStudent("Meena",8));
		
		TreeMap<String, ArrayList<ArrayStudent>> t1 = new TreeMap<String, ArrayList<ArrayStudent>>();
		t1.put("1st standard", a1);
		t1.put("2nd standard", a2);
		t1.put("3rd standard", a3);
		
		Set<Map.Entry<String,ArrayList<ArrayStudent>>> s1 = t1.entrySet();
		
		for (Map.Entry<String,ArrayList<ArrayStudent>> e1 : s1) {
			System.out.println(e1.getValue());
			System.out.println(e1.getKey());
			System.out.println("----------------");
		}
		System.out.println(t1.get("1st standard"));
	}
}
