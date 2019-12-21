package constructorOverloading;

public class TestStudent 
{
	public static void main(String[] args) 
	{
		Student s1= new Student();
		System.out.println("name is "+s1.name);
		System.out.println("name is "+s1.age);
		
		Student s2 = new Student("Sai", 22);
		System.out.println("name is "+s2.name);
		System.out.println("name is "+s2.age);
	}
}
