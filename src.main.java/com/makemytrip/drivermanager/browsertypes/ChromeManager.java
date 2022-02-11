package com.makemytrip.drivermanager.browsertypes;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.makemytrip.drivermanager.IBrowserManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeManager implements IBrowserManager {
	@Override
	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> preferences = new HashMap<>();
		preferences.put("download.prompt_for_download", false);
		preferences.put("download.default_directory",
				"/Users/user/eclipse-workspace/automationbootcamp2/target/test-classes/automationbootcampproject/");
		options.setExperimentalOption("prefs", preferences);

		WebDriver driver = new ChromeDriver(options);
		return driver;

	}

}
