package inheritance;

public class Child extends Parent {
	public void display()
	{
		System.out.println("CHILD");
		
	}

	public static void main(String[] args) {
		Parent obj=new Child();
		obj.display1();

	}

}
