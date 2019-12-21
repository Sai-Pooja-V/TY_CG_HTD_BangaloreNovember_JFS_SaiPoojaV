package com.cg.objectClass.hashCodeMethod;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(23, "Sai");
		System.out.println(e1.hashCode());
		
		Employee e2 = new Employee(22,	"Pooja");
		System.out.println(e2.hashCode());
		System.out.println(e2);
		
	}
	
}
