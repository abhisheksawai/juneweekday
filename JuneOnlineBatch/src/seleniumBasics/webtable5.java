package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webtable5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\JuneBatchOnlineJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		String comptosearch = "Andhra Bank";
		List <WebElement> companyname=driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr/td[1]"));
		List <WebElement> currentprice=driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr/td[4]"));
		
		for(int i = 0; i<currentprice.size(); i ++)
		{
			String storecomp = companyname.get(i).getText();	
			
			if(storecomp.equals(comptosearch))
			{
				System.out.println(currentprice.get(i).getText());
			}
		}
		

	}

}
