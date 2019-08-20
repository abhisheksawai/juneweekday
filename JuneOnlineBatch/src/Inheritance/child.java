package Inheritance;

public class child extends Parent {
	
	public void c1()
	{
		System.out.println("this is c1 method");
	}

	public void p1()
	{
		System.out.println("this is p1 from child method");
	}
	public static void main(String[] args) {
		
		child c = new  child();
		System.out.println(c.i);
		
		c.p1(); // from parent  method
		c.c1(); // from child  method
	
	}

}
