package com.cg.collectionInterface.vectorList;

import java.util.Vector;

public class VectorMethods {
	public static void main(String[] args) {
		Vector v1 = new Vector();
		System.out.println("size before: "+v1.size());
		System.out.println("capacity before: "+v1.capacity());
		v1.add(23);
		v1.add(56);
		v1.add(78);
		v1.add(100);
		System.out.println("V1 List: "+v1);
		System.out.println("size after: "+v1.size());
		System.out.println("capacity after: "+v1.capacity());
		
		v1.trimToSize();
		System.out.println("size after trim: "+v1.size());
		System.out.println("capacity after trim: "+v1.capacity());
		
		v1.setSize(10);
		System.out.println("setSize(10): "+v1.size());
		System.out.println("V1 List: "+v1);
		
		v1.add(200);
		System.out.println("Size: "+v1.size());
		System.out.println("V1 List: "+v1);
		
		v1.set(6, 600);
		System.out.println("V1 List: "+v1);
	}
}
