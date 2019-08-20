package stringDemo;

public class String10 {

	public static void main(String[] args) {
		
		String name = "abhishek is learning selenium";
		String sepwords[] =name.split("\\s");   // \\s is for space
		
		System.out.println(sepwords[0]);
		System.out.println(sepwords[1]);
		System.out.println(sepwords[2]);
		System.out.println(sepwords[3]);
		
		System.out.println("========================");
		for(String s :sepwords)
		{
			System.out.println(s);
		}
		System.out.println("----------------");
		for(int i =0; i <=3; i ++)

		{
			System.out.println(sepwords[i]);
		}

		
	}

}
