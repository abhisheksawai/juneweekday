package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\JuneBatchOnlineJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.trivago.in/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("pune");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//mark[text()='Pune'])[2]")).click();
		
	
	}

}
