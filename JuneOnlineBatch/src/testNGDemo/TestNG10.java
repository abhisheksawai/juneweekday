package testNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG10 {
	
	@Test(priority=-1)
	public void TCC()
	{
		System.out.println("TCC");		
	}
	@Test(priority=-2)
	public void TCA()
	{
		System.out.println("TCA");		
	}
	@Test(priority=2)
	public void TCB()
	{
		System.out.println("TCB");		
	}
	
	
	
}
