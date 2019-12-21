package localAndGlobalVariables;

public class Car extends Vehicle {

		int cost = 30000;
		
		void carDetails()
		{
			int cost = 10000;
			
			System.out.println("Local Variable Car cost is "+cost);
			System.out.println("Global Variable Car cost is "+this.cost);
			System.out.println("Parent class Variable Car cost is "+super.cost);
		}
}
