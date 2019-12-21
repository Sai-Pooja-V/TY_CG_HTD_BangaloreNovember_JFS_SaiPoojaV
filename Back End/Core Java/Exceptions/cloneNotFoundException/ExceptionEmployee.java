package com.cg.checkedException.cloneNotFoundException;

public class ExceptionEmployee {
	public static void main(String[] args) {
		System.out.println("main started");
		Employee e1 = new Employee();
		try {
			Object e2 = e1.clone();
			System.out.println("object is cloned");
			try {
				Class c1 = Class.forName("Employee");
			}catch(ClassNotFoundException e) {
				System.out.println("class not found ");
			}
		}catch(CloneNotSupportedException e) {
			System.out.println("clone is not supported");
		}
		System.out.println("main ended");
	}
}
