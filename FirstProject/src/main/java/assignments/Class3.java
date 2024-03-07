package assignments;

public class Class3 extends Class2 {
	public void print()
	{
		double total=bp+hra-pf-ded+bonus;
		System.out.println(" Basic pay= "+bp+"\n Deduuction= "+ded+"\n HRA= "+hra+"\n PF= "+pf+"\n Bonus= "+bonus+"\n Total Salary= "+total);
	}
	


	public static void main(String[] args) {
		Class3 obj=new Class3();
		obj.pay();
		obj.calculate();
		obj.print();
		
	}

}
