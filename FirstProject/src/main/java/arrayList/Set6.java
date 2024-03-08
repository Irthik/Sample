package arrayList;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> obj=new LinkedHashSet<String>();
		obj.add("Hello");
		obj.add("World");
		obj.add("Red");
		
		Set<String> obj1=new LinkedHashSet<String>();
		obj1.add("Blue");
		obj1.addAll(obj);
		
		System.out.println(obj.contains("Red"));
		System.out.println(obj.containsAll(obj1));

	}

}
