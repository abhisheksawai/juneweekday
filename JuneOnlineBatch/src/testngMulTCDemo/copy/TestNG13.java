package testngMulTCDemo.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG13 {
	
	@Test
	public void login()
	{
		System.out.println("login");		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\JuneBatchOnlineJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("worng //='email']")).sendKeys("abhishek");
	}
	@Test(dependsOnMethods= {"login"})
	public void mobilebuy()
	{
		System.out.println("mobilebuy");	
		
	}
	@Test
	public void TCB()
	{
		System.out.println("TCB");		
	}
	
	
	
}
