
public class ImmutableClass {

	private String name;
	private int age;
	public ImmutableClass(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	String getName() {
		return this.name;
	}
	int getAge() {
		return this.age;
	}
	
}
