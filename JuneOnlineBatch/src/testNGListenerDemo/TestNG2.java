package testNGListenerDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(testNGListenerDemo.ListenerDemo.class)
public class TestNG2 {
	
	@Test
	public void tc22()
	{
		System.out.println("tc22 for listner");		
	}
	@Test
	public void tc2()
	{
		System.out.println("tc2 for listner");		
	}
	

	
}
