package com.cg.checkedException.cloneNotFoundException;

public class Employee implements Cloneable {

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
