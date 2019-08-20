package staticDemo;

public class TestStudent {
	
	
	
	public static void main(String[] args) {
		
	//	student s1 = new student();
		//s1.rollno=100; // memory allocate hoga
		//s1.name="Abhishek";// memory allocate hoga
		
		student s1 = new student(100,"vaishali");
		student s2 = new student(101,"sneha");
		student s3 = new student(102,"ramesh");
		s1.displaystudinfo();
		s2.displaystudinfo();
		System.out.println(s1.rollno);
		s3.displaystudinfo();
		
	}

}
