package looseCoupling;

public class TestCat {

	public static void main(String[] args) {
		CatFactory c1 = new CatFactory();
		Chips c2 = new Chips();
		Lays l1 = new Lays();
		Kurkure k1 = new Kurkure();
		Bingo b1 = new Bingo();
		
		c1.feedChips(c2);
	}
}
