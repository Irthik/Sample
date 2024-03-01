package abstraction;

public class Bike extends Car {

	public static void main(String[] args) {

		Bike obj=new Bike();
		obj.method();
		obj.dis();

	}
	@Override
	public void method() {
		System.out.println("Hero Honda");
		
	}

}
