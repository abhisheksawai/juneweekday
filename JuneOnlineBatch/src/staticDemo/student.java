package staticDemo;

public class student {
	
	int rollno;  //instance variable
	String name;
	static String collegename="MIT"; // static variable	
	
	public student(int i, String studname) {
		
		rollno = i;
		name = studname;
	}
	
	public void displaystudinfo()
	{
		System.out.println(rollno+" "+name+" "+collegename);
	}
	
	
	
	

}
