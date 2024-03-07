package assignments;

import java.util.Scanner;
public class HDFC implements RBI {

	@Override
	public float recurringDeposit() {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the principle amount = ");
		float p=obj.nextFloat();
		System.out.print("Enter the duration in months = ");
		int n=obj.nextInt();
		float r=9.15f;
		
		float FAmount=(p*r*n)/100;
		System.out.println("Final amount= "+FAmount);
		return FAmount;
	}

	public static void main(String[] args) {
		HDFC obj1=new HDFC();
		obj1.recurringDeposit();
	

	}

}
