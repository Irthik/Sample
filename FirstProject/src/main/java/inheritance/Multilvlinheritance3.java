package inheritance;

public class Multilvlinheritance3 extends Multilvlinheritance2 {
	public void display3()
	{
		System.out.println("WORLD");
	}

	public static void main(String[] args) {
		Multilvlinheritance3 obj=new Multilvlinheritance3();
		obj.display();
		obj.display2();
		obj.display3();
	

	}

}
