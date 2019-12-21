package fInalVariable;

public class TestIIB {

	public static void main(String[] args) {
		InstanceInitializerBlock i = new InstanceInitializerBlock();
		System.out.println(i.maximum);
		System.out.println(InstanceInitializerBlock.PI);
				
		System.out.println("----------------------------------");
		InstanceInitializerBlock i1 = new InstanceInitializerBlock(2);
		System.out.println(i1.maximum);
	}
	
}
