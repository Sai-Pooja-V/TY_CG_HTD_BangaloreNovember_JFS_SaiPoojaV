
public class StringMethods {
	public static void main(String[] args) {
	
		String s1 = "John";
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.length());
		
		String s2 = "    John Michel    ";
		System.out.println(s2.trim());
		
		String s3 ="Sudhanshu";
		System.out.println(s3.substring(4));
		System.out.println(s3.substring(4, 8));
		System.out.println(s3.isEmpty());
		
		String s4 ="Shree";
		System.out.println(s4.indexOf("hre"));
		System.out.println(s4.charAt(4));
		System.out.println(s4.indexOf('r'));
		System.out.println(s4.indexOf("re", 2));
		
		String s5="ShreeShree";
		System.out.println(s5.indexOf("re", 4));
	}
}
