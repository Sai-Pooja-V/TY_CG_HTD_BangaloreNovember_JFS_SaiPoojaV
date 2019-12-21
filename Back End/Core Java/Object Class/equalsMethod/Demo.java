package com.cg.objectClass.equalsMethod;

public class Demo {

	public static void main(String[] args) {
		
		String s1 = "Sai";
		String s2 = new String("Sai");
		String s3 = "Sai";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println("-----");
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s3);
		
	}
	
}
