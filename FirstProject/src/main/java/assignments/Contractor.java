package assignments;

public class Contractor extends Employee {
	
	private int wrkhrs;
	public Contractor(String Name,int payperhr,int wrkhrs)
	{
		super(Name,payperhr);
		this.wrkhrs=wrkhrs;

	}

	@Override
	public int calculateSalary() {
		return getpayperhr()*wrkhrs;

	}

}
