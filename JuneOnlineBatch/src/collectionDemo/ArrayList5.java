package collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayList5 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("abhishek");
		al.add("ramesh");
		al.add("10");
		System.out.println(al);
		System.out.println(al.get(2));
		
		ArrayList al1 = new ArrayList();
		al1.addAll(al);
		al1.add("this is al1");
		System.out.println(al1);
		
		ArrayList al2 = new ArrayList(al1);
		al2.add("this is al2");
		System.out.println(al2);
		
		

	}

}
