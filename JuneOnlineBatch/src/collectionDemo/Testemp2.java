package collectionDemo;

public class Testemp2 {

	public static void main(String[] args) {
		
		emp e1 = new emp(100,"Abhihshek");
		emp e2 = new emp(101,"sneha");
		emp e3 = new emp(102,"ramesh");
		
		// int a[] = new int[3];
		//a[0] = 10;
		emp e[] = new emp[2];
		e[0] = e1;
		e[1] = e2;
		e[2] = e3;
		
		for( emp ee: e)
		{
			System.out.println(ee.empno);
			System.out.println(ee.ename);
		}
		
		
		
	}

}
