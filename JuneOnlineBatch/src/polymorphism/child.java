package polymorphism;

public class child extends parent {

	public void game()
	{
		//super.shadi();
		System.out.println("like to play chess");
		
	}
	public void shadi()
	{
		System.out.println("GF");
		//System.out.println("only GF");
	}
	
	public static void main(String[] args) {
		
		child c = new child();
		c.game();
		//super.shadi(); can not have super in static
		c.shadi();
		c.property();
	
		
	}

}
