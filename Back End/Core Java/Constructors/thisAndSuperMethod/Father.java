package thisAndSuperMethod;

public class Father 
{
	 
	String name;
	int age;
	
	public Father() {
		System.out.println("A");
	}
	
	Father(String n, int a)
	{
		this();
		System.out.println("B");
	}
}
