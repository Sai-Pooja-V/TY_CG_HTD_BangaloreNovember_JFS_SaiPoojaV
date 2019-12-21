package instanceOfExample;

public class Crush {

	void recieve(Mobile m)
	{
		if(m instanceof BasicSet)
			System.out.println("Thanks");
		else if(m instanceof Oppo)
			System.out.println("Thank you");
		else if(m instanceof OnePlus)
			System.out.println("Thank you so much dear");
		else if(m instanceof Apple)
			System.out.println("Love you");
		else
			System.out.println("Idiot");
	}
	
}
