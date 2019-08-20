package testNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG11 {
	
	@Test
	public void TCC()
	{
		System.out.println("TCC");		
	}
	@Test(enabled=false)
	public void TCA()
	{
		System.out.println("TCA");		
	}
	@Test
	public void TCB()
	{
		System.out.println("TCB");		
	}
	
	
	
}
