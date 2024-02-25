package aggregation;

public class Author {
	String authorname;
	String place;
	Book b;
	
	public Author(String authorname,String place,Book b)
	{
		this.authorname=authorname;
		this.place=place;
		this.b=b;
	}
	
	public void print()
	{
		System.out.println(b.age+" "+b.name+"");
		System.out.println(authorname+" "+place);
	}

	public static void main(String[] args) {
		Book c=new Book("ONV",82);
		Author a=new Author("Kurupp","Kerala",c);
		a.print();
		
	}

}
