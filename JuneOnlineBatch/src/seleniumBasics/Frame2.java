package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\JuneBatchOnlineJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/assets/popuppages/netbanking.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[text()='Continue to NetBanking'])[2]")).click();
		System.out.println("clicked on net banking");
		//driver.switchTo().frame(0);
		driver.switchTo().frame("login_page");		
	//	driver.switchTo().frame("webelement dena padega");  // iss par bat karnege
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("22222");
		System.out.println("entered user id");
		//driver.switchTo().defaultContent();  // sidha bahar ana hai to 
	//	driver.switchTo().parentFrame();  // child se parent me aana ho to

	}

}
