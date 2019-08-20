package encapsulation;

public class TestStudentEncap {

	public static void main(String[] args) {
		
		student s = new student();  // encapusla wala class ka object
		
		// now i want to set name of that student
		s.setNameofStud("selenium"); // set name of stud  // setter method
		System.out.println(s.getNameofStud()); // getting value of name // getter mthod

	}

}
