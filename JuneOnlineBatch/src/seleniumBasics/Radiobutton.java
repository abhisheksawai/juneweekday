package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\JuneBatchOnlineJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement gender = driver.findElement(By.xpath("//input[@type='radio' and @value='1']")); //ye direct radio par click kiya
		//driver.findElement(By.xpath("//label[text()='Female']")).click();  ye uske label par click kiya
		//gender.click();
		
		boolean gendercheck;
		gendercheck = gender.isSelected();  // we are chekcing here , ki wo selected hai ki nahi ....
		System.out.println(gendercheck);   // value true if selected else false
		
		
		
		
	}

}
