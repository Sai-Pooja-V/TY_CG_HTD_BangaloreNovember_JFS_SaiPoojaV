package multipleInterfaces;

public class Son implements Father1, Father2{

	public void home() {
		Father2.super.home();  //Father1.super.home();
	}
	
}
