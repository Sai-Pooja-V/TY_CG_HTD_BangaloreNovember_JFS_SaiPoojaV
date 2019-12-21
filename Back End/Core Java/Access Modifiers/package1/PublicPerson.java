package com.cgty.accessmodifier.package1;

public class PublicPerson {

	public String name;
	static public int age=23;
	
	public PublicPerson(String name) {
		this.name=name;
	}
	
	public void personDetails() {
		System.out.println("name is "+name);
	}
	
	public static void details() {
		System.out.println("age is "+age);
	}
}
