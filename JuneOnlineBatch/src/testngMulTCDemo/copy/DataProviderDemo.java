package testngMulTCDemo.copy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@Test(dataProvider="mytestcasedata")
	public void login(String uname, String pass)
	{
		System.out.println(uname);
		System.out.println(pass);
	}
	
	
	@DataProvider
	public Object[][] mytestcasedata()
	{
		
			Object arr[][]= new Object[2][2];
			arr[0][0]="uname 1";
			arr[0][1]="Password 1";
		
			arr[1][0]="uname 2";
			arr[1][1]="password 2";
			return arr;

	}


}
