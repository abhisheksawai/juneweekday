package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG16 {

	
	
		@Test
		public void softAssert(){
			SoftAssert softAssertion= new SoftAssert();
			System.out.println("softAssert Method Was Started");
			softAssertion.assertTrue(false);
			System.out.println("softAssert Method Was Executed");
			softAssertion.assertAll();
			System.out.println("test case true");
		}
		
	@Test
		public void hardAssert(){
			System.out.println("hardAssert Method Was Started");
			Assert.assertTrue(false);
			System.out.println("hardAssert Method Was Executed");
			System.out.println("test case true");
	}}

