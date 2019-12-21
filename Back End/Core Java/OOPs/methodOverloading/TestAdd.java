package methodOverloading;

public class TestAdd {

	public static void main(String[] args) {
		
		Add a = new Add();
		
		System.out.println(a.add(12));  //int r1 = a.add(12);   System.out.println(r1);
		System.out.println(a.add(12, 21));
		System.out.println(a.add(12.5));
	}
}
