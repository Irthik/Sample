package arrayList;

import java.util.ArrayList;

public class ArrayList5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>obj=new ArrayList<String>();
			obj.add("Red");
			obj.add("Black");
			obj.add("Blue");
			obj.add("Green");
			
			obj.remove(1);
			System.out.println(obj);
			obj.remove("Red");
			System.out.println(obj);

	}

}
