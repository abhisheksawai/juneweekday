package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\JuneBatchOnlineJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.navigate().to("https://www.facebook.com/");
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//input[@class='inputtext']")).sendKeys("username");
		driver.findElement(By.xpath("(//input[@class='inputtext'])[2]")).sendKeys("password");

}}
