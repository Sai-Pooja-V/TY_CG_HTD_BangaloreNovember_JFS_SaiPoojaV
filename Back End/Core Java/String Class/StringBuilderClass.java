
public class StringBuilderClass {

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("Hello");
		System.out.println("Old s1= "+s1.hashCode());
		s1.append(" World");
		System.out.println(s1);
		System.out.println("New s1= "+s1.hashCode());
	}
	
}
