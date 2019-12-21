package multipleInterfaces;

public class TestRobot {

	public static void main(String[] args) {
		Robot r = new Robot();
		r.move();
		r.talk();
		System.out.println("----------------------");
		Moment m = new Robot();
		m.move();
		System.out.println("----------------------");
		Sound s = new Robot();
		s.talk();
	}
	
}
