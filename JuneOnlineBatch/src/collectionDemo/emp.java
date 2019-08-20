package collectionDemo;

public class emp {
	
	
	int empno;
	String ename;
	
	public emp(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;		
	}
	
	public void display()
	{
		System.out.println(empno);
		System.out.println(ename);
	}

}
