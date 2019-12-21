package com.cg.checkedException.exceptionPropagation;

public class B {
	static void m() throws ClassNotFoundException {
		C.n();
	}
}
