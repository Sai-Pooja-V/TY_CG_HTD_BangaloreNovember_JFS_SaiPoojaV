
public class TestImmutableClass {

	public static void main(String[] args) {
		ImmutableClass i1 = new ImmutableClass("John", 22);
		System.out.println("i1 hashcode "+i1.hashCode());
		
		i1=new ImmutableClass("Michel",24);
		System.out.println("i1 new hashcode "+i1.hashCode());
		System.out.println("Name is "+i1.getName());
		System.out.println("Age is "+i1.getAge());
	}
	
}
