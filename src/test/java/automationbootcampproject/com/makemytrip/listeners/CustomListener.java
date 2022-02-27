package automationbootcampproject.com.makemytrip.listeners;

import org.apache.log4j.MDC;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		String tcName = result.getMethod().getMethodName();
		MDC.put("testCaseName", tcName);
	}
}
