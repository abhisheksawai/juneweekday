package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverMethod9 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\JuneBatchOnlineJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.seleniumhq.org/");
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().refresh();
		
	
	
	}

}
