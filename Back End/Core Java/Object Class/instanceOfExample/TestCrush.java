package instanceOfExample;

public class TestCrush {

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		Crush c1 = new Crush();
		
		BasicSet b = new BasicSet();
		Oppo o = new Oppo();
		OnePlus op = new OnePlus();
		Apple a = new Apple();
		
		c1.recieve(a);
		c1.recieve(b);
		c1.recieve(o);
		c1.recieve(op);
		c1.recieve(m1);
		c1.recieve(null);
		
	}
	
}
