package b;

import AccessModifyDemo.protDemo;
				// child extend parent
public class testprotdemoOut extends protDemo {

	public static void main(String[] args) {
		
		// child c = new child();
		testprotdemoOut po = new testprotdemoOut();
		System.out.println(po.protd);
		po.protmsg();
		
		
	}

}
