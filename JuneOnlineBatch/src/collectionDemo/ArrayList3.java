package collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayList3 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		ArrayList al1 = new ArrayList();
		al.add("abhishek"); //2
		al.add("ramesh"); //+3
		al.add("10"); //4
		al.add("20.12"); //5	
	
		al.add("ashwini");//1
		al.add("kumar");		
		System.out.println(al);
		System.out.println("after replace");
		al.set(3, "33.99");
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al1.isEmpty());
		al.clear();
		System.out.println(al);
		System.out.println("after cleAR");
		
		

		
		

	}

}
