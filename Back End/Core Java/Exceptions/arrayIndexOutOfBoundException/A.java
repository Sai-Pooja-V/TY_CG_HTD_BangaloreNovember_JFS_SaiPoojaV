package com.cg.exceptions.arrayIndexOutOfBoundException;

public class A {
	public static void main(String[] args) {
		System.out.println("main started");
		int [] a = new int[2];
		a[0]=10;
		a[1]=20;
		try {
			a[2]=30;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("no size to store the value");
		}
		System.out.println("main ended");
	}
}
