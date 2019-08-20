package collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayList6 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("abhishek");
		al.add("ramesh");
		al.add("10");
		System.out.println(al);
		System.out.println(al.get(1));
		
	for(Object aa:al)
	{
		System.out.println(aa);
	}
		
	for(int i =0 ; i<= al.size() ; i ++)
	{
		System.out.println(al);
	}
	
	for(int i =0 ; i< al.size() ; i ++)
	{
		//String listname = (String) al.get(i);
	//	System.out.println(listname);
		System.out.println(al.get(i));
	
	}
		

	}

}
