package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class alertpopup {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\JuneBatchOnlineJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		WebElement sixgb = driver.findElement(By.xpath("//input[@name='login']"));
		sixgb.sendKeys("usernamedalnahai");
		
		//click on go that is signin
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		// then we will get popup
		driver.switchTo().alert().accept();
	//	driver.switchTo().alert().dismiss(); // agar cancel karna hoto
	//	driver.switchTo().alert().getText(); // agar kuch text chhaiye alert par hai to
	//	driver.switchTo().alert().sendKeys("alertparkcuhsendkarna"); // send karna hoto
		//driver fir ham swithc kiya , kispe , alert pe , 
		System.out.println("minize kebad");
	}

}
