
public class StringBufferClass {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Hello");
		System.out.println("Old s1= "+s1.hashCode());
		s1 = s1.append(" World");
		System.out.println(s1);
		System.out.println("New s1= "+s1.hashCode());
	}
	
}
