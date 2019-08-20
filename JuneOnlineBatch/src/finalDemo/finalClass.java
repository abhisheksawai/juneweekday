package finalDemo;

public class finalClass {

	final int roll=100;  // final variable
	//int roll =1030;
	
	public void printroll()
	{
		roll = 100;
		System.out.println(roll);
	}
	
	public static void main(String[] args) {
		
		finalClass fc = new finalClass();
		fc.printroll();

	}

}
