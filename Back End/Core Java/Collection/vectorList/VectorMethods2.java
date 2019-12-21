package com.cg.collectionInterface.vectorList;

import java.util.Vector;

public class VectorMethods2 {
	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.addElement(23);
		v1.addElement(76);
		v1.addElement(98);
		v1.addElement(34);
		v1.add(78);
		System.out.println("V1 List: "+v1);
		v1.removeElement(new Integer(34));
		System.out.println("remove 34: "+v1);
		v1.removeElementAt(2);
		System.out.println("remove at 2: "+v1);

		Object o1[] = new Object[v1.size()];
		v1.copyInto(o1);
		for(int i=0; i<o1.length ; i++) {
			System.out.println(o1[i]);
		}

		v1.removeAllElements();
		System.out.println(v1);

		Vector v2 = new Vector();
		v2.addElement(23);
		v2.addElement(76);
		System.out.println("V2 list: "+v2);
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		v2.trimToSize();
		System.out.println(v2.size());
		System.out.println(v2.capacity());

		v2.ensureCapacity(6);
		v2.setSize(8);  //here size > capacity. so capacity is doubled
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		System.out.println("V2 list: "+v2);
	}
}
