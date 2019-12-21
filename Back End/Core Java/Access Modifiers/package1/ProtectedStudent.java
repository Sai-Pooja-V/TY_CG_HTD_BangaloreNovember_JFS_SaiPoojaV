package com.cgty.accessmodifier.package1;

public class ProtectedStudent {

	protected String name;
	
	protected ProtectedStudent(String name) {
		this.name = name;
	}
	
	protected void studDetails() {
		System.out.println("Student name is "+name);
	}
}
