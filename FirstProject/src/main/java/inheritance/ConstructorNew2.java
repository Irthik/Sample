package inheritance;

public class ConstructorNew2 extends ConstructorNew {
	public ConstructorNew2()
	{
		super();
		System.out.println("CHILD");
	}

	public static void main(String[] args) {
		ConstructorNew2 o=new ConstructorNew2();

	}

}
