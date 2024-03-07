package assignments;

public class Bank {
	private int pin;
	public int getPin()
	{
		return pin;
	}
	public void setPin(int pin)
	{
	this.pin=pin;	
	}
	
	public void valid()
	{
		this.pin=pin;
		switch(pin)
		{
		case 1001:
			System.out.println("Valid Pin");
			break;
			
		case 1234:
			System.out.println("Valid Pin");
			break;
			
		case 1212:
			System.out.println("Valid Pin");
			break;
		default:
			System.out.println("Invalid Pin!!");
		}
	}

}
