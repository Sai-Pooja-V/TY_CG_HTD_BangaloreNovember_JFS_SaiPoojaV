package com.cg.arrayClass.arrayInitialization;

public class IntegerArray {
	public static void main(String[] args) {
		int a1[] = new int[4];
		a1[0] = 10;
		a1[1] = 20;
		a1[2] = 30;
		a1[3] = 40;
		
		for(int i=0 ; i < a1.length ; i++) {
			System.out.println(a1[i]);
		}
		
		System.out.println(a1.length);
	}
}
