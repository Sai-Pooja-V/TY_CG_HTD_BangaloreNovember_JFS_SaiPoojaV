package Encapsulation;

public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.setAge(18);
		p1.setName("Sai");
		
		System.out.println(p1.getAge());
		System.out.println(p1.getName());
	}
}
