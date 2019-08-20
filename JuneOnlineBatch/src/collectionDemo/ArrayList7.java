package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList7 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("abhishek");
		al.add("ramesh");
		al.add("10");
		//System.out.println(al);

		
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}


	}

}
