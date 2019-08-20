package collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("abhishek"); //2
		al.add("ramesh"); //+3
		al.add("10"); //4
		al.add("20.12"); //5	
	
		al.add(0, "ashwini");//1
		al.add(0, "kumar");		
		System.out.println(al);
		//al.remove();
		al.remove("kumar");
		System.out.println("after remove");
		System.out.println(al);
		al.remove("kumar");
		System.out.println("after remove--------");
		System.out.println(al);
		
		
		//al.remove(100);

		
		

	}

}
