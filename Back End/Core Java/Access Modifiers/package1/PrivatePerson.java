package com.cgty.accessmodifier.package1;

public class PrivatePerson {

	private String name;
	
	private PrivatePerson(String name)
	{
		this.name=name;
	}
	
	private void disp() {
		System.out.println("name is"+name);
	}
	
}
