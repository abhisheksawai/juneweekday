package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
	
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\JuneBatchOnlineJars\\chromedriver.exe");
				//ChromeDriver driver = new ChromeDriver();  // abhishek ne kam start kar diya - icicic
			//	FirefoxDriver driver = new FirefoxDriver();	//suraj ne kam start kiya - hdfc
				///InternetExplorerDriver driver2 = new InternetExplorerDriver();  // ramesh ie  - yes bank
				
				WebDriver driver = new ChromeDriver();
			
				driver.get("url");
	
	}

}
