package com.cg.collectionInterface.treeSetClass;

public class Employee implements Comparable<Employee>{
	String name;
	int age;
	int salary;
	public Employee(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
//	@Override
//	public int compareTo(Employee o) {
//		if(this.age > o.age)
//			return 1;
//		else if(this.age < o.age)
//			return -1;
//		else
//			return 0;
//	}
	
//	@Override
//	public int compareTo(Employee o) {
//		if(this.salary > o.salary)
//			return 1;
//		else if(this.salary < o.salary)
//			return -1;
//		else
//			return 0;
//	}
	
//	@Override   //Ascending order
//	public int compareTo(Employee o) {
//		return this.name.compareTo(o.name);
//	}
//	
	@Override   //Descending
	public int compareTo(Employee o) {
		return o.name.compareTo(this.name);
	}
	
}
