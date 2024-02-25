package inheritance;

public class HeirInheritance2 extends HeirInheritance{
	public void display2()
	{
		System.out.println("World");
	}
	public static void main(String args[])
	{
		HeirInheritance2 obj=new HeirInheritance2();
		obj.display();
		obj.display2();
	}

}
