package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBox1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\JuneBatchOnlineJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/mobile-phones-store?otracker=nmenu_sub_Electronics_0_Mobiles");
		Thread.sleep(5000);
		WebElement sixgb = driver.findElement(By.xpath("//div[contains(text(),'6 GB & Above')]"));
		sixgb.click();
		
		boolean sixgbcheck;
		sixgbcheck = sixgb.isSelected();  // we are chekcing here , ki wo selected hai ki nahi ....
		System.out.println(sixgbcheck);   // value true if selected else false
		
		
		
		
	}

}
