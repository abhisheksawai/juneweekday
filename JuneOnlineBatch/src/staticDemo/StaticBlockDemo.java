package staticDemo;

public class StaticBlockDemo {	
	static
	{
		System.out.println("s1");
	}
	
	{
		System.out.println("i1");
	}
	
	StaticBlockDemo(){
		System.out.println("c1");}
	
	public static void main(String[] args) {	
		StaticBlockDemo sd = new StaticBlockDemo();		
	}

}
