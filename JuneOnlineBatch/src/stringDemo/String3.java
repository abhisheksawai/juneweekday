package stringDemo;

public class String3 {

	public static void main(String[] args) {
		
		String name1 = "sachin";  // SCP   same 
		String name2 = "sachin";  // SCP	same
		String name3 = new String("sachin");   // new object - iska location alag rahega
		
		System.out.println(name1.equals(name2));  //value / contents
		System.out.println(name1.equals(name3));
		System.out.println(name2.equals(name3));
		System.out.println("-----------");
		System.out.println(name1==name2);  // == -> location // true
		System.out.println(name1==name3);  //false
		System.out.println(name2==name3);	//false
		
		
		
	}

}
