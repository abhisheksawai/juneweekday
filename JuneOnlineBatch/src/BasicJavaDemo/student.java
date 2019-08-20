package BasicJavaDemo;

public class student {
	
	int rollno;
	String name;
	
	public static void main(String[] args) {
		int i;
		//student s;
		student s = new student();
		student s1 = new student();
		// s is object of class student
		
		s.rollno = 101;
		s.name = "Abhishek";				
		System.out.println(s.rollno +" "+s.name);
		
		
		s1.rollno = 102;
		s1.name = "Abhijeet";
		System.out.println(s1.rollno +" "+s1.name);
	}

}
