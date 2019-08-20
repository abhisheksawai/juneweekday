package BasicJavaDemo;

public class nestedforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		for(i=1;i<=3;i=i+1)
		{
			//i have one more for loop
			for(int j =1;j <=3;j++)
			{
				System.out.println(i+" "+j);
				//System.out.println(i +" "+j);
			}
			
		}
	}

}
