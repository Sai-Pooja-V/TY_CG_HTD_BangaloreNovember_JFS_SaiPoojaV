package com.cgty.typecasting.primitive;

public class Primitive {
	//implicit typecasting
	byte b = 4;
	
	short s = b;
	int i = b;
	float f = b;
	double d = b;
	
	void value() {
		System.out.println("byte value is "+b);
		System.out.println("short value is "+s);
		System.out.println("int value is "+i);
		System.out.println("float value is "+f);
		System.out.println("doubled value is "+d);
	}
	
	//explicit typecasting
	double pi = 3.142;
	
	int a = (int) pi;
	
	void details()
	{
		System.out.println("double value is "+pi);
		System.out.println("int value is "+a);
	}
	
}
