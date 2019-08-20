package polymorphism;

public class addition {

	public void addition()
	{
		System.out.println("a1");
	}
	
	public void addition()
	{
		System.out.println("passed parameter -i");
	}
	
	
	public static void main(String[] args) {
		
		addition a = new addition();
		a.addition();
		a.addition(10);
		

	}

}
