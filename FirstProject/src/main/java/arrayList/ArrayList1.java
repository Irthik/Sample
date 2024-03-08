package arrayList;
import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>listobj=new ArrayList<String>();
		listobj.add("Blue");
		listobj.add("Green");
		
		ArrayList<String>listobj2=new ArrayList<String>();
		listobj2.add("Violet");
		listobj2.add("Red");
		
		listobj.addAll(listobj2);
		System.out.println(listobj);

	}

}
