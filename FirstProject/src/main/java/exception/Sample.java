package exception;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
					
		int a=10;
		int b=0;
		int c;
		c=a/b;
		//System.out.println("Hello");
		
		}
		
		catch(ArithmeticException a)
		{
				System.out.println("Exception occured please skip");
				System.out.println(a);
		}
		
		
	/*	finally
		{
			System.out.println("Exception checked");
		}
		*/

	}
}
