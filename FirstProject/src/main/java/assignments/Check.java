package assignments;

public class Check extends Addition {
	public Check()
	{
		super();
		if(sum%10==0)
		{
			System.out.println("The number is divisible by 10");
		}
		else
		{
			System.out.println("The number is not divisible by 10");
		}
	}

	public static void main(String[] args) {
		Check obj=new Check();

	}

}
