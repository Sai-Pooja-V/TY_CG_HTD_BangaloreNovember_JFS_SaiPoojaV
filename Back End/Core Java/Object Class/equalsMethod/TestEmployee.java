package com.cg.objectClass.equalsMethod;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee(22, "Sai");
		Employee e2 = new Employee(22, "Sai");
		Employee e3 = new Employee(21,"Pooja");
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
	}
	
}
