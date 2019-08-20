package Inheritance;

public class smalldog extends dog {
	
	public void s1()
	{
		System.out.println("band kar di window s1");
	}
	
	public static void main(String[] args) {
	
		//smalldog sd = new smalldog();
		//smalldog sd = new dog();
		//smalldog sd = new animal();
		//dog sd = new dog();
		//dog sd = new smalldog();
		//dog sd = new animal();
		//animal sd = new smalldog();
		//animal sd = new animal();
		animal sd = new dog();
		sd.a1();  // animal wala method
		sd.d1();   // dog wala method
		sd.s1();  // ye khud ka method small dog wala		
	}
}
