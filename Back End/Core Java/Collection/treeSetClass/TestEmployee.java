package com.cg.collectionInterface.treeSetClass;

import java.util.TreeSet;

public class TestEmployee {
	public static void main(String[] args) {
		EmployeeName e1 = new EmployeeName();
		EmployeeAge e2 = new EmployeeAge();
		EmployeeSalary e3 = new EmployeeSalary(); 
		TreeSet<Employee> t1 = new TreeSet<Employee>(e3);
		t1.add(new Employee("John",22,20000));
		t1.add(new Employee("Michel",21,25000));
		t1.add(new Employee("Ramu",25,30000));
		
		for (Employee emp : t1) {
			System.out.println("Employee name : "+emp.name);
			System.out.println("Employee age : "+emp.age);
			System.out.println("Employee salary : "+emp.salary);
			System.out.println("------------------------");
		}
	}
}
