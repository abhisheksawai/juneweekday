package collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("abhishek");
		al.add("ramesh");
		al.add("10");
		al.add(10);  // auto boxing
		al.add(Integer.valueOf(15));
		al.add("20.12");
		al.add(null);
		al.add("abhishek");
		
		System.out.println(al);

		
		

	}

}
