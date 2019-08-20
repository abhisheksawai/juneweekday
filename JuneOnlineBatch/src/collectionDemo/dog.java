package collectionDemo;

public class dog extends animal {
	
	public static void main(String[] args) {
		

		dog d=new dog();  
		
		System.out.println(d instanceof dog);
	    System.out.println(d instanceof animal);
	    System.out.println("-----------------");
	    animal a = new dog();
	    System.out.println(a instanceof dog);
	    System.out.println(a instanceof animal);
	    
	}

}
