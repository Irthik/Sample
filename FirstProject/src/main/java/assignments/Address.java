package assignments;

public class Address {
	String Housename;
	String Place;
	Student c;
	
	public Address(String Housename,String Place,Student c)
	{
		this.Housename=Housename;
		this.Place=Place;
		this.c=c;
	}

	public void display()
	{
		System.out.println("Name: "+c.name+"\nRoll No.:"+c.rollno);
		System.out.println("Address: "+Housename+", "+Place);
	}
	public static void main(String[] args) {
		Student x=new Student("Irthik",14);
		Address z=new Address("Dreamland","Attingal",x);
		z.display();
		
		

	}

}
