package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\JuneBatchOnlineJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement ddBirthday = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s = new Select(ddBirthday);
		//Select s = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
		
		s.selectByIndex(12);  // 0 means day only but via index
		s.selectByValue("0");   // hamne value diya hai
		s.selectByVisibleText("3");  // means jo hame dikh raha hai
		
		
	}

}
