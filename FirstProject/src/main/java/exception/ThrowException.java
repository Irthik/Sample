package exception;

public class ThrowException {
	public void display()
	{
		int a=12;
		if(a<18)
		{
			throw new ArithmeticException("Not Eligible");
		}
		else
		{
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) {
		ThrowException obj=new ThrowException();
		obj.display();
	
	}

}
