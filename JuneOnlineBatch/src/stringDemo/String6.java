package stringDemo;

public class String6 {

	public static void main(String[] args) {
		
		String s = "selenium ishfh for web HHHis automation";
		System.out.println(s.replace("is", "xx"));
					  
		
		String s1 = "selenium is for web is automation";
		System.out.println(s1.replaceAll("(.*)is(.*)", "was"));
					  

	}

}
