package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG14Hard {

	
	@Test
		public void VerifyHomePage()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\JuneBatchOnlineJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("https://www.gmail.com");
		
		String actualTitle = "Gmaill";
		
		Assert.assertEquals(driver.getTitle(), actualTitle);
		
		System.out.println("test case passed"); // if test case fail this statement will not run
	}
	
	
	}
