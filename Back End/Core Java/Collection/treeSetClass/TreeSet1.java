package com.cg.collectionInterface.treeSetClass;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet t1 = new TreeSet();
		
		t1.add(89);
		t1.add(56);
		t1.add(90);
		t1.add(10);
		
		Iterator itr = t1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
