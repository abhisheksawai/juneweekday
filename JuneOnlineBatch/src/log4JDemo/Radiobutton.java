package log4JDemo;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\JuneBatchOnlineJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	Logger log = Logger.getLogger("logdemo");
	//	PropertyConfigurator.configure("log4j.properties");
		
		Logger log = Logger.getLogger("log demo");
		PropertyConfigurator.configure("log4j.properties");

		
		driver.get("https://www.facebook.com/");
		//Logger log = Logger.getLogger("log demo");
		PropertyConfigurator.configure("log4j.properties");
		log.info("url launched");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abhishek");
		log.info("entered username successfully");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("password");
		log.info("entered password successfully");
		log.info("-----------------------");
		
	}

}
