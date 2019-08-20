package testNGDemo;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class annotations {
	
	
	@BeforeSuite
	public void Beforesuite() {
		System.out.println("i am in before suite");
	}
	

	@BeforeTest
	public void BeforeTest() {
		System.out.println("i am in before test");
	
}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("i am in before class");
	}
	
	@BeforeMethod
	public void Beforemethod()
	{
		System.out.println("i m in before method");
	}
	
	
	@Test
	public void test1()
	{
		System.out.println("i am normal test case");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("i am in after method");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("i am in after class");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("i am in after test");
	}
	
	@AfterSuite
	public void AfterSuite()
	{
	System.out.println("i am in after suite");
	}
}
