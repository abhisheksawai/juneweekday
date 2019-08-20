package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBox3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\JuneBatchOnlineJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		Thread.sleep(5000);
		WebElement sixgb = driver.findElement(By.xpath("//input[@value='red']"));
		sixgb.click();
		
		Thread.sleep(5000);
		boolean sixgbcheck;
		sixgbcheck = sixgb.isSelected();  // we are chekcing here , ki wo selected hai ki nahi ....
		System.out.println(sixgbcheck);   // value true if selected else false
		
		
		
		
	}

}
