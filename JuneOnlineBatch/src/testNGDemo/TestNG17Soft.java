package testNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG17Soft {
	

	@Test
	public void VerifyLoginPage()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\JuneBatchOnlineJars\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	

	driver.get("https://www.gmail.com");
	
	String actualTitle = "Gmaill";
	
	SoftAssert Assert = new SoftAssert();
	
	Assert.assertEquals(driver.getTitle(), actualTitle);
	System.out.println("test case passed"); // test case failed but this statemwnt will run 
	Assert.assertAll();
}
	


}
