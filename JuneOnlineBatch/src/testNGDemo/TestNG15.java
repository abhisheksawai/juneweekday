package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG15 {

	
	@Test
		public void VerifyHomePage() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\JuneBatchOnlineJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.google.com/");
		//driver.findElement(By.xpath("//='email']")).sendKeys("abhishek");
		//Assert.assertEquals("Google", driver.getTitle());
		
		driver.get("https://www.google.com/");
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abhishek");
		//Test Condition 2: If page title didnt match with actualTitle then script throws an exception
		Thread.sleep(2000);
		
		String expectedTitle = "Gooogle";
		
		Assert.assertTrue(expectedTitle.equals(driver.getTitle()));
		
		System.out.println("test case true");
	}
}
