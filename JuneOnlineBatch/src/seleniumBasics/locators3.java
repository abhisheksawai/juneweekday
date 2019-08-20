package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\JuneBatchOnlineJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.navigate().to("https://www.facebook.com/");
		driver.get("https://www.facebook.com/");
		
		//	driver.findElement(By.id("uska id dena hai , jo element hame find karna hai")).action karni hai wo element ke sath
		//driver.findElement(By.id("email")).sendKeys("abhishek");
		
		//sending username to facebook page
		driver.findElement(By.id("email")).sendKeys("kumar");
		System.out.println("username entered");
		//sending password to facebook page
		driver.findElement(By.id("pass")).sendKeys("password1234");
		System.out.println("password entered");
		//driver.findElement(By.id("u_0_2")).click();
		//driver.findElement(By.id("u_0_a")).click();
		
	}

}
