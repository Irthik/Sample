package inheritance;

public class SingleInheritance1 extends SingleInheritance{
public void print()
{
	System.out.println("World");
}
	public static void main(String[] args) {
		SingleInheritance1 obj=new SingleInheritance1();
		obj.print();
		obj.display();

	}

}
