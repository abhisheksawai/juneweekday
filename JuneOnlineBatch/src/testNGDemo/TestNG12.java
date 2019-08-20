package testNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG12 {
	
	@Test
	public void TCC()
	{
		System.out.println("TCC");		
	}
	@Test
	public void TCA()
	{
		System.out.println("TCA");	
		throw new SkipException("i do not want to execute this tc as server is down");
	}
	@Test
	public void TCB()
	{
		System.out.println("TCB");		
	}
	
	
	
}
