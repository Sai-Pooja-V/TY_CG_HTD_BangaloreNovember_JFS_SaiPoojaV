package com.cg.threads.pvr;

public class User extends Thread{
	PVR p;

	public User(PVR p) {
		super();
		this.p = p;
	}
	
	
		public void run() {
			p.confirmTicket();
		}
	
	

}
