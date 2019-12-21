package com.cg.objectClass.getClassMethod;

public class TestDog {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Dog d1 = new Dog("pinky");
		Class c = d1.getClass();
		System.out.println(c);
		
		Dog d2 = (Dog) c.newInstance();
		System.out.println(d2.name);
		
//		Class c2 = Class.forName("Dog");
//		System.out.println(c2);
		
		//Create default package for these
	}
	
}
