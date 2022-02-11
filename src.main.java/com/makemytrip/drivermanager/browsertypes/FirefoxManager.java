package com.makemytrip.drivermanager.browsertypes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.makemytrip.drivermanager.IBrowserManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxManager implements IBrowserManager {
	@Override
	public WebDriver getDriver() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		return driver;
	}

}
