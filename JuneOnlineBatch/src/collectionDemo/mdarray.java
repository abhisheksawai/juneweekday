package collectionDemo;

public class mdarray {


	public static void main(String args[]){  
	//declaring and initializing 2D array  

		int [][] arr = new int [2][3];
		
		int [] brr = new int [3][2];
				
		// 3 row 3 col
		// single me tha - a[0]=11;
		
		arr[0][0] = 10;
		arr[0][1] = 130;
		arr[0][2] = 120;
		arr[1][0] = 140;
		arr[1][1] = 140;
		arr[1][2] = 140;
		
		for(int i = 0 ; i <2 ; i ++)
		{
			for (int j =0 ;j <3 ; j++)
			{
				System.out.println(arr[i][j]);
			}
		}
		

}
}