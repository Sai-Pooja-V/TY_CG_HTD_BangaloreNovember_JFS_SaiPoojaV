package com.cg.collectionInterface.vectorList;

import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add(23);
		v1.add(87);
		v1.add(90);
		v1.add(56);
		v1.add(83);
		System.out.println("V1 List: "+v1);
		v1.remove(new Integer(87));
		System.out.println("remove 87: "+v1);
		
		v1.add(1, 67);
		System.out.println("V1 List: "+v1);
		v1.set(3, 90);
		System.out.println("V1 List: "+v1);
	}
}
