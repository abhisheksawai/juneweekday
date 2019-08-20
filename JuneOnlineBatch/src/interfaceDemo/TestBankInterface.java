package interfaceDemo;

public class TestBankInterface {

	public static void main(String[] args) {		
		
		//IciciBank i = new IciciBank();
		//IciciBank i = new RBI();
		RBI i = new IciciBank();
		
		//i.laptoploan();
		i.carloan();
		i.homeloan();
		System.out.println("-----------------");
	
		RBI h = new HDFCBank();
		//h.tvloan();
		h.carloan();
		h.homeloan();
	}

}
