package staticDemo;

public class CounterkaProgram {
	
	int count=0; // it will get memory each time
	
	public CounterkaProgram()
	{
		count ++;
		System.out.println(count); //1
	}
	public static void main(String[] args) {		
		CounterkaProgram cp1 = new CounterkaProgram();
		CounterkaProgram cp2 = new CounterkaProgram();
		CounterkaProgram cp3 = new CounterkaProgram();
		
		System.out.println(count);
	}

}
