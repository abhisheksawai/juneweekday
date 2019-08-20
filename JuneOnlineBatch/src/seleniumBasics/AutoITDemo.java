package seleniumBasics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\JuneBatchOnlineJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.navigate().to("https://www.facebook.com/");
		driver.get("http://tinyupload.com/");
		
		driver.findElement(By.xpath("//input[@name='uploaded_file']")).click();
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Users\\lenovo\\Desktop\\June Batch 19\\juneonlineweekend.exe");
		System.out.println("file updaloed");

	}

}
