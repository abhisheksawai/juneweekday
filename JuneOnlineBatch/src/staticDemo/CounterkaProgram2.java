package staticDemo;

public class CounterkaProgram2 {
	
	static int count=0; // it will get memory only once
	int anothercount =10;
	
	public CounterkaProgram2()
	{
		count ++;
		System.out.println(count); //
	}
	public static void main(String[] args) {		
		CounterkaProgram2 cp1 = new CounterkaProgram2();
		CounterkaProgram2 cp2 = new CounterkaProgram2();
		CounterkaProgram2 cp3 = new CounterkaProgram2();
		System.out.println(anothercount);
	
	}

}
