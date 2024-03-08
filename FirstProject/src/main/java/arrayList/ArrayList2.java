package arrayList;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>obj=new ArrayList<String>();
		obj.add("Violet");
		obj.add("Blue");
		obj.add("Green");
		obj.add("Yellow");
		System.out.println(obj.contains("Blue"));
		boolean a=obj.contains("blue");
		System.out.println(a);


	}

}
