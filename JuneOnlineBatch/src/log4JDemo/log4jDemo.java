package log4JDemo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class log4jDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\junebatchJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Logger log = Logger.getLogger("log mobile buy change");
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("browser launch karto");
		driver.get("https://www.flipkart.com/");
		log.info("browser launch zal");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		log.info("element la click kelay");
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
		log.info("element la click kelay parat ekda");
		log.info("===============");
		
		
	

	}

}
