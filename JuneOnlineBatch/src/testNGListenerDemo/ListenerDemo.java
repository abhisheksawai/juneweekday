package testNGListenerDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemo implements ITestListener {


	public void onTestStart(ITestResult result) {	
		System.out.println("Listenre me likha hai onTestStart ab maine change kiya-> "+result.getName());		
	}


	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess"+result.getName());		
	}

	
	public void onTestFailure(ITestResult result) {		
		System.out.println("onTestFailure"+result.getName());
		// can have screenshot code ,to check failed tc only
	}


	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped"+result.getName());		
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {		
		System.out.println("onTestFailedButWithinSuccessPercentage"+result.getName());
	}

	
	public void onStart(ITestContext context) {
		System.out.println("check onStart");		
	}


	public void onFinish(ITestContext context) {
		System.out.println("check onFinish");
	}
	
	

}
