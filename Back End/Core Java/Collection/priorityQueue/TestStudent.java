package com.cg.collectionInterface.priorityQueue;

import java.util.PriorityQueue;

public class TestStudent {
	public static void main(String[] args) {
		PriorityQueue<Student> p1 = new PriorityQueue<>();
		p1.offer(new Student("Divya", 22));
		p1.offer(new Student("Shree", 23));
		
		for (Student student : p1) {
			System.out.println(student); 
		}
	}
}
