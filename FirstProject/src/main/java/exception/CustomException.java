package exception;

public class CustomException {
	public void display(int age) throws LicenceException
	{
		if(age<18)
		{
		throw new LicenceException("Not Eligible");
		}
		else
		{
			System.out.println("Eligible");
		}
	}

	public static void main(String args[]) throws LicenceException
	{
		CustomException obj=new CustomException();
		obj.display(12);
	}

}
