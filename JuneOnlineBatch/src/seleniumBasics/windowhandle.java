package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class windowhandle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\JuneBatchOnlineJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	//	driver.findElement(By.xpath("//strong[text()='Demo Website for Practice Automation']")).click();
		// ye wale pe click karke hame second win child-->
		driver.findElement(By.xpath("//strong[text()='Demo Website for Practice Automation']")).click();
		
		Set <String> s = driver.getWindowHandles();
		Iterator <String> it = s.iterator();
		String parentwin = it.next();
		String childwindow = it.next();
		// yaha par ham save nahi kar sakte
		
		Thread.sleep(3000);
		driver.switchTo().window(childwindow);
		Thread.sleep(3000);
		System.out.println("we are in child win and text is --->");
		// yaha par ham save kar ssakte
		
		System.out.println(driver.findElement(By.xpath("//a[text()='Interactions']")).getText());
		Thread.sleep(3000);
		System.out.println("switch to parent");
		driver.switchTo().window(parentwin);
		System.out.println(driver.findElement(By.xpath("//strong[text()='Demo Website for Practice Automation']")).getText());
		
		
	}

}
