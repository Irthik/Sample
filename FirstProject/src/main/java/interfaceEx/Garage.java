package interfaceEx;

public class Garage implements Bike, Car {
	public static void main(String args[])
	{
			Garage obj=new Garage();
			obj.displayC();
			obj.displayB();
	}

	@Override
	public void displayC() {
		System.out.println("Nissan GTR");

	}

	@Override
	public void displayB() {
		System.out.println("Duccati");
	}

}
