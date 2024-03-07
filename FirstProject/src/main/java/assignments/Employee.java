package assignments;

public abstract class Employee {
	private String Name;
	private int payperhr;
	
	public Employee(String Name, int payperhr)
	{
		this.Name=Name;
		this.payperhr=payperhr;
		
	}
	public abstract int calculateSalary();
	public String getName()
	{
		return Name;
	}
	
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public int getpayperhr()
	{
		return payperhr;
	
	}
	public void setpayperhr(int payperhr)
	{
		this.payperhr=payperhr;
	}

}
