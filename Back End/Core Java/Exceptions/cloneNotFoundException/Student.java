package com.cg.checkedException.cloneNotFoundException;

public class Student implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
