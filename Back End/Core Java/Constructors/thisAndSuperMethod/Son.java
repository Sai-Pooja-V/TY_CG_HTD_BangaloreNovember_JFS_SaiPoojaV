package thisAndSuperMethod;

public class Son extends Father {

	Son()
	{
		super("John",23);
		System.out.println("C");
	}
	
	Son(String n, int a)
	{
		this();
		
		System.out.println("D");
	}
}
