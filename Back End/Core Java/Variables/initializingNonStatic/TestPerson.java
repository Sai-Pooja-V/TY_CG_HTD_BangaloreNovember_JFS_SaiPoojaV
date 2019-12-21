package initializingNonStatic;

public class TestPerson {

		public static void main(String arr[])
		{
			//Person p = new Person(); //one way of initializing non static members.
			//p.age=23;
			//p.name="John";
			//p.personDetails();
			
			//Person p1=new Person();    //second way of initializing non static members.
			//p1.initialize(25, "Smith");
			//p1.personDetails();
			
			Person p = new Person(23, "John"); //third way of initializing non static members.
			p.personDetails();
		}
}
