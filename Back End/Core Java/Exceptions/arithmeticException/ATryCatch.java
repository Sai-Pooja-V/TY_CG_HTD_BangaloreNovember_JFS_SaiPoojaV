package com.cg.exceptions.arithmeticException;

public class ATryCatch {

	void divide(int a , int b) {
		System.out.println("Divide method started");
		try {
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println("Dont divide by zero");
		}
		System.out.println("Divide method ended");
	}
	
	
}
