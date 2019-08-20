package collectionDemo;

public class OuterInnerDemo {	
	private int i = 30;	
	class inner{		
		void msg()
		{
			System.out.println("msg");
		}
	}
	public static void main(String[] args) {
		OuterInnerDemo o = new OuterInnerDemo();
		OuterInnerDemo.inner i = o.new inner();
		i.msg();
		

	}

}
