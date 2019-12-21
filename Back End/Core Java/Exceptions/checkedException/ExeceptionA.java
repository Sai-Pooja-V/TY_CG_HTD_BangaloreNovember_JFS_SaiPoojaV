package com.cg.checkedException.checkedException;

public class ExeceptionA {

	public static void main(String[] args) {
		System.out.println("Main started");
		
		try {
			Class c1 = Class.forName("checkedException.Person");
			System.out.println("class is found");
		}catch(ClassNotFoundException e) {
			System.out.println("class not found");
		}
		System.out.println("main ended");
	}
	
}
