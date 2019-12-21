
public class DemoLiterals {

	public static void main(String[] args) {
		String s1 = "John";
		String s2 = "Michel";
		
		System.out.println("s1 hashcode "+s1.hashCode());
		System.out.println("s2 hashcode "+s2.hashCode());
		
		s2 = "Pinky";
		System.out.println("s2 new hashcode"+s2.hashCode());
		
		String s3 = "John";
		System.out.println("s3 hashcode "+s3.hashCode());
	}
	
}
