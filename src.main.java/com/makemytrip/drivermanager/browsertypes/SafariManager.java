package com.makemytrip.drivermanager.browsertypes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.makemytrip.drivermanager.IBrowserManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SafariManager implements IBrowserManager {

	@Override
	public WebDriver getDriver() {
		WebDriverManager.safaridriver().setup();
		WebDriver driver = new SafariDriver();
		return driver;
	}

}
