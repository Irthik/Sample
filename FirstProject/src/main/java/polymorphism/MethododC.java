package polymorphism;

public class MethododC extends Methododp {
	public void display()
	{
		System.out.println("Child class");
		super.display();
	}


	public static void main(String[] args) {
		MethododC obj=new MethododC();
		obj.display();
		
	}

}
