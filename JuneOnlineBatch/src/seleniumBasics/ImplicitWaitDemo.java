package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWaitDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\JuneBatchOnlineJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//button[text()='Proceed to Recharge']")).getText());
		
		//clickon checkbox
		driver.findElement(By.xpath("//i[@class='shPe']")).click();
		
		System.out.println(driver.findElement(By.xpath("//button[text()='Recharge Now']")).getText());
		/// explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 100);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[text()='Recharge Now']")))).click();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[text()='Recharge Now']")))).click();
	}

}
