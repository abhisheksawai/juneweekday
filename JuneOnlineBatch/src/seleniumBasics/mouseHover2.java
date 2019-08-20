package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class mouseHover2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\JuneBatchOnlineJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");		
			
		WebElement ele = driver.findElement(By.xpath("//a[text()='Forgotten account?']"));		
		Actions action= new Actions(driver);	
		action.contextClick(ele).build().perform();
	//	action.keyDown(Keys.DOWN).click();
		
		//action.keyDown(Keys.CONTROL).click(ele).keyUp(Keys.CONTROL).build().perform();		
	}

}
