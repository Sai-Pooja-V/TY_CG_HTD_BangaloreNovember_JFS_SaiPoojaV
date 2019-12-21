package fInalVariable;

public class InstanceInitializerBlock {

	final int maximum;
	static final double PI;
	
	InstanceInitializerBlock()
	{
		System.out.println("Inside constructor");
		
	}
	
	InstanceInitializerBlock(int a)
	{
		System.out.println("Inside parameterized constructor");
		
	}
	
	{
		System.out.println("Inside IIB");
		this.maximum=3000;
	}
	
	static
	{
		System.out.println("Inside static block");
		PI = 3.142;
	}
	
}
