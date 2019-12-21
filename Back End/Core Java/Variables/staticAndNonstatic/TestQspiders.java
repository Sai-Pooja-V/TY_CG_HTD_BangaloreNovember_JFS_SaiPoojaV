package staticAndNonstatic;

public class TestQspiders 
{
	public static void main(String arr[])
	{
		Qspiders rajajinagar = new Qspiders();
		rajajinagar.swipe();
		rajajinagar.swipe();
		
		Qspiders btm = new Qspiders();
		btm.swipe();
		
		System.out.println(rajajinagar.branchCount);
		System.out.println(btm.branchCount);
		System.out.println(Qspiders.totalCount);
	}
}
