package finalprgrm;

public class FinalVariable {
	final int i=10;
	public void num()
	{
	//	i=100
		System.out.println(i);
	}

	public static void main(String[] args) {
		FinalVariable obj=new FinalVariable();
		obj.num();

	}

}
