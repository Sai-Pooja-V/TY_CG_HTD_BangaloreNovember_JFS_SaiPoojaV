package multiLevelInheritance;

public class TestGeneration 
{
	public static void main(String arr[])
	{
		/*FG f =new FG();
		f.call();
		f.msg();
		
		SG s = new SG();
		s.call();
		s.msg();
		s.radio();
		
		TG t = new TG();
		t.call();
		t.msg();
		t.radio();
		t.camera();*/
		
		FG f =new TG();
		f.call();
		f.msg();
		
		SG s = new TG();
		s.call();
		s.msg();
		s.radio();
		
		TG t = new TG();
		t.call();
		t.msg();
		t.radio();
		t.camera();
		
		//TG t1 = new FG();   //not possible11	e
		
	}
}
