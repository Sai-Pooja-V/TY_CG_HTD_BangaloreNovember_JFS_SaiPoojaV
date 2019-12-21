package com.cg.checkedException.exceptionPropagation;

public class D {
	static void o() throws ClassNotFoundException {
		Class.forName("exceptionPropagation.A");
	}
}
