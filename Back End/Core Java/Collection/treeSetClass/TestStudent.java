package com.cg.collectionInterface.treeSetClass;

import java.util.Iterator;
import java.util.TreeSet;

public class TestStudent {
	public static void main(String[] args) {
		TreeSet<Student> t1 = new TreeSet<Student>();
		t1.add(new Student("John ",22));
		t1.add(new Student("Michel",23));
		t1.add(new Student("John ",22));
		t1.add(new Student("Raju ",22));
		t1.add(new Student("John ",24));
		
		Iterator<Student> itr = t1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
