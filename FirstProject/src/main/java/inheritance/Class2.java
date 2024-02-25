package inheritance;

public class Class2 extends Class1{
	public void display2()
	{
	int num=10;
	System.out.println(num);
	System.out.println(super.num);
	}

	public static void main(String[] args) {
		Class2 obj=new Class2();
		obj.display2();

	}

}
