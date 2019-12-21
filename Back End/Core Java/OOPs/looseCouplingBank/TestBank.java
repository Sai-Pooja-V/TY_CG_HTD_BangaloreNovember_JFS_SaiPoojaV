package looseCouplingBank;

public class TestBank {

	public static void main(String[] args) {
		Bank b = new Bank();
		ATM a1 = new ATM();
		SBI s = new SBI();
		HDFC h = new HDFC();
		
		b.designed(a1);
		
	}
}
