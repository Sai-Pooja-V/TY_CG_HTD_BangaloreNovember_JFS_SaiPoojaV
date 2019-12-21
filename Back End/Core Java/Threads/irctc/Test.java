package com.cg.threads.irctc;

public class Test {
	public static void main(String[] args) {
		System.out.println("main started");
		IRCTC i1 = new IRCTC();
		User u1 = new User(i1);
		u1.start();
		User u2 = new User(i1);
		u2.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		
		i1.leaveMe();
		System.out.println("main ended");
	} 
}
