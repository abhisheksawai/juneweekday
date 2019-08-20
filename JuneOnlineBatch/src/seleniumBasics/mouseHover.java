package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class mouseHover {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\JuneBatchOnlineJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions a = new Actions(driver);
		//Actions act = new Actions(driver);
		a.moveToElement(electronics).build().perform();
		//action class ke object ko , ham bata rahe hai , kya karna hai
		// movetoelement , konse element [electronics] build aur perform
		
	}

}
