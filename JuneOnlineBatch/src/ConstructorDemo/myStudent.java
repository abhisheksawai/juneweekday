package ConstructorDemo;

public class myStudent {
	int rollno;
	String name;
	
	public myStudent(int i, String s) 
	{
		rollno = i;
		name = s;
		System.out.println(i);
		System.out.println(name);
	}

	public myStudent() {
		System.out.println("calling default constructor");
	}
}
