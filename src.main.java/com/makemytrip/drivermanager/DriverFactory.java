package com.makemytrip.drivermanager;

import org.openqa.selenium.WebDriver;

import com.makemytrip.drivermanager.browsertypes.ChromeManager;
import com.makemytrip.drivermanager.browsertypes.FirefoxManager;
import com.makemytrip.drivermanager.browsertypes.SafariManager;
import com.makemytrip.file.readers.PropertyReader;

public class DriverFactory {

	private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

	public static WebDriver createDriver() {

		WebDriver driver;

		switch (PropertyReader.getProperty("browser").toLowerCase()) {
		case "chrome":
			driver = new ChromeManager().getDriver();
			break;
		case "firefox":
			driver = new FirefoxManager().getDriver();
			break;
		case "safari":
			driver = new SafariManager().getDriver();
			break;
		default:
			throw new IllegalArgumentException("Unsupported browser type. Cannot proceed with the execution");
		}

		driverThreadLocal.set(driver);

		return driver;
	}

	public static WebDriver getDriverInstance() {
		return driverThreadLocal.get();
	}
}
