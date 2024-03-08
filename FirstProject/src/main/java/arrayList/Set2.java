package arrayList;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> obj=new LinkedHashSet<String>();
		obj.add("Bat");
		obj.add("Ball");
		obj.add("Stump");
		
		Set<String> obj1=new LinkedHashSet<String>();
		obj1.add("Blue");
		obj1.addAll(obj);
		
		System.out.println(obj1);
		

	}

}
