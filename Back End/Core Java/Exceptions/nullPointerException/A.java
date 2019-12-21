package com.cg.exceptions.nullPointerException;

public class A {
	void write() {
		System.out.println("write method called");
		String s = null;
		try {
			System.out.println("Length of string is "+s.length());
		}catch(NullPointerException e) {
			System.out.println("Dont use null");
		}
		System.out.println("write method ended");
	}
	
	public static void main(String[] args) {
		System.out.println("main started");
		A a = new A();
		a.write();
		System.out.println("main ended");
	}
}
