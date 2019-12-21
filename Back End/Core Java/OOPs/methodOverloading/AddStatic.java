package methodOverloading;

public class AddStatic 
{
	static void add(int a)
	{
		System.out.println(a+a);
	}
	
	static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	static void add(double a)
	{
		System.out.println(a+a);
	}
}
