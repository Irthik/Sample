package interfaceEx;

public class Sample1 implements Sample {
	public static void main(String args[])
	{
		Sample1 obj=new Sample1();
		obj.display();
	}

	@Override
	public void display() {
		System.out.println("IMPLEMENTS");

	}

}
