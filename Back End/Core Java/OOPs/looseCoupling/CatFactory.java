package looseCoupling;

public class CatFactory 
{
	void feedChips(Chips c) {
		c.open();
		c.eat();
	}
}
