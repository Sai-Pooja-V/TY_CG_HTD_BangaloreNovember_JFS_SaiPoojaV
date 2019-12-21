package com.cg.objectClass.toStringMethod;

public class Student {

	int id;
	String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student id is " + id + ", name is " + name + "]";
	}
	
	
	
}
