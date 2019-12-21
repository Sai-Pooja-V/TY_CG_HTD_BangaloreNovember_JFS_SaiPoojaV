package com.cg.exceptions.arithmeticException;

public class TestATryCatch {
	public static void main(String[] args) {
		System.out.println("main started"); 		
		ATryCatch  a = new ATryCatch();
		a.divide(10, 0);
		System.out.println("main ended");
	}
}
