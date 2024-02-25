package inheritance;

public class HeirInheritance3 extends HeirInheritance {
	public void display3()
	{
		System.out.println("Human");
	}
	public static void main(String args[])
	{
		HeirInheritance3 obj=new HeirInheritance3();
		obj.display();
		obj.display3();
	}
}
