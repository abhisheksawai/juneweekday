package polymorphism;

public class polyExample {

	public int addition(int a, int b)
	{
		System.out.println("a1");
		return 0;
	}
	
	public int addition(int x, int y)
	{
		System.out.println("one para");
		return 0;
		}
	
	public int addition(int y, int x)
	{
		return 0;
	}
		
	public static void main(String[] args) {
		
		polyExample a = new polyExample();
	
		a.addition();
		a.addition(20);
		
	
	
	}
}
