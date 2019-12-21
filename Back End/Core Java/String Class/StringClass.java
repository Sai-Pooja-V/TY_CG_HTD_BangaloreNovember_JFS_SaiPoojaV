
public class StringClass {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		System.out.println("Old s1= "+s1.hashCode());
		s1 = s1.concat(" World");
		System.out.println(s1);
		System.out.println("New s1= "+s1.hashCode());
	}
	
}
