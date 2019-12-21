package hierarchicalInheritance;

public class TestAnimal 
{
	public static void main(String arr[])
	{
		Dog d = new Dog();
		d.eat();
		d.walk();
		
		Lion l = new Lion();
		l.eat();
		l.run();
	}
}
