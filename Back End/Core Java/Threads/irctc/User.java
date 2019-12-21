package com.cg.threads.irctc;

public class User extends Thread {
	IRCTC i1;

	public User(IRCTC i1) {
		super();
		this.i1 = i1;
	}
	
	@Override
	public void run() {
		i1.confirmTicket();
	}
}
