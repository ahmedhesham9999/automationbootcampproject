package automationbootcampproject.com.makemytrip.pages;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.makemytrip.drivermanager.DriverFactory;
import com.makemytrip.externalservers.DBManager;
import com.makemytrip.file.manager.DirectoryManager;
import com.makemytrip.file.readers.JsonReader;
import com.makemytrip.file.readers.PropertyReader;

public class BaseTest {
	/*
	 * public static WebDriver driver;
	 */
	@BeforeSuite
	public void setPrerequisite() {

		DirectoryManager.cleanDirectory("output", "allure-report", "allure-result");

		JsonReader reader = new JsonReader();
		reader.read();

		PropertyReader pReader = new PropertyReader();
		pReader.read();

		DBManager.connect();
		PropertyConfigurator.configure("src/main/resources/log4j.properties");

	}

	@BeforeMethod
	public void launchBrowser() {
		WebDriver driver = DriverFactory.createDriver();
		driver.manage().window().maximize();

	}

	/*
	 * @AfterMethod
	 * 
	 * public void closeBrowser() { DriverFactory.getDriverInstance().quit(); }
	 * 
	 * @AfterSuite public void cleanUp() { DBManager.closeConnection(); }
	 */

}
