package com.cg.exceptions.arithmeticException;

public class TestA {
	public static void main(String[] args) {
		System.out.println("main started"); 		
		A  a = new A();
		a.divide(10, 0);
		System.out.println("main ended");
	}
}
