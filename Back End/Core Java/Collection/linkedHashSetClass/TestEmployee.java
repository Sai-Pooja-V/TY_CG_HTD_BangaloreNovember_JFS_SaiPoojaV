package com.cg.collectionInterface.linkedHashSetClass;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestEmployee {
	public static void main(String[] args) {
		LinkedHashSet<Employee> l1 = new LinkedHashSet<Employee>();
		l1.add(new Employee("Sai",22));
		l1.add(new Employee("Pooja",24));
		l1.add(new Employee("Sai",22));
		
		Iterator<Employee> ltr = l1.iterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
	}
}
