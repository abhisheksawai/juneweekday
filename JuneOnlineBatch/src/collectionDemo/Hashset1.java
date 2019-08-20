package collectionDemo;

import java.util.HashSet;

public class Hashset1 {

	public static void main(String[] args) {
		
		
		HashSet<String> set = new HashSet();
		
		set.add("abhishek");
		set.add("100");
		set.add("100");
		set.add(null);
		set.add(null);
		set.add("selenium");
		
		System.out.println(set);

	}

}
