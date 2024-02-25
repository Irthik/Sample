package inheritance;

public class Class4 extends Class3 {
	public void print()
	{
		int num1=14;
		System.out.println(num1);
		super.print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method 
Class4 obj=new Class4();
obj.print();

	}

}
