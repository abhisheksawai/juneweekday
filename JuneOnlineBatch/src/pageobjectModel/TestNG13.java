package pageobjectModel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG13 {	
	
	//learning prop file
	@Test
	public void login() throws Exception
	{
		System.out.println("login");		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\JuneBatchOnlineJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
				
		File kumar = new File("E:\\World Of Program\\JuneOnlineBatch\\OR.properties");
		FileInputStream fis = new FileInputStream(kumar);
		
		// to read properties file, we are creating its object
		Properties prop = new Properties();
		prop.load(fis);
		
		// for data prop file
		File src = new File("E:\\World Of Program\\JuneOnlineBatch\\Data.properties");
		FileInputStream fisdata = new FileInputStream(src);
		
		// to read properties file, we are creating its object
		Properties propdata = new Properties();
		propdata.load(fisdata);
		
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abhishek");
		//driver.findElement(By.xpath("txt_username_facebook")).sendKeys("abhishek");
		//driver.findElement(By.xpath(prop.getProperty("txt_username_facebook"))).sendKeys("abhishek");
		//input[@name='email'] == (prop.getProperty("txt_username_facebook")) are same
		
		driver.findElement(By.xpath(prop.getProperty("txt_username_facebook"))).sendKeys(propdata.getProperty("Testdatausername"));
		
		
	}
	
	
	
	
}
