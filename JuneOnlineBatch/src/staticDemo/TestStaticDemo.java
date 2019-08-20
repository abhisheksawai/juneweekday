package staticDemo;

public class TestStaticDemo {

	public static void main(String[] args) {
		
		
		StaticMethodDemo smd = new StaticMethodDemo();
		smd.msg();
		//smd.check();
		//StaticMethodDemo smd1 = new StaticMethodDemo();
		//smd1.check();
		
		StaticMethodDemo.check();
//		StaticMethodDemo.msg();
		

	}

}
