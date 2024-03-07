package assignments;

public class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String Name,int payperhr)
	{
		super(Name,payperhr);
	}

	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		return getpayperhr()*8;
	}

	public static void main(String[] args) {
		Employee obj=new Contractor("Contractor",20,10);
		Employee obj1=new FullTimeEmployee("Full Time Employee",8);
		System.out.println(obj.calculateSalary());
		System.out.println(obj1.calculateSalary());

	}

}
