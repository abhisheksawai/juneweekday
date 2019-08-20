package AccessModifyDemo;

public class inheritPriDemo extends privatedemo {

	public void selfmethod()
	{
		System.out.println("self method");
	}
	
	public static void main(String[] args) {
		
		inheritPriDemo id = new inheritPriDemo();
		id.selfmethod();
		id.msg();

	}

}
