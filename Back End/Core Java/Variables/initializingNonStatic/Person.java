package initializingNonStatic;

public class Person 
{
	int age;
	String name;
	
	Person(int a, String s)
	{
		age = a;
		name = s;
	}
	
	void personDetails() {
		System.out.println("name is "+name+" and age is "+age);
	}
	
	void initialize(int a, String s)
	{
		age=a;
		name=s;
	}
}
