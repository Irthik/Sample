package abstraction;

public class Square extends Shape {

	public static void main(String[] args) {

	Square obj=new Square();
	obj.meth();
	obj.display();
	}
	
	@Override
	public void meth() {
		System.out.println("This is the abstract method body.");
	}

}
