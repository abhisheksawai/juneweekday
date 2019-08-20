package abstractionDemo;

public class maruti extends car {

	public static void main(String[] args) {		
		maruti m = new maruti();
		//maruti m = new car();
		//car m = new maruti();
		//car m = new car();
		m.brand();
		m.color();
		m.marutiself();
	}
	
	public void marutiself()
	{
		System.out.println("maruti self");
	}
	
	public void brand() {
		System.out.println("maruti brand");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	
}
