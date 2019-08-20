package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\JuneBatchOnlineJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.navigate().to("https://www.facebook.com/");
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.linkText("Forgotten account?")).click(); // yahi chalega

	//	driver.findElement(By.partialLinkText("Forgotten")).click();
	//	driver.findElement(By.partialLinkText("account")).click();
	//	driver.findElement(By.partialLinkText("ten acc")).click();
		
		driver.findElement(By.linkText("Forgotten")).click();

}}
