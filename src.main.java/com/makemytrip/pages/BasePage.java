package com.makemytrip.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.makemytrip.drivermanager.DriverFactory;

public class BasePage {
	WebDriver driver;

	public BasePage() {
		this.driver = DriverFactory.getDriverInstance();
	}

	protected void goToUrl(String url) {
		driver.get(url);
	}

	protected void fillText(By by, String text) {
		getElement(by).sendKeys(text);
	}

	protected void click(By by) {
		getElement(by).click();
		// capture screenshot
	}

	protected void selectFromDropdown(By by, String visibleText) {
		Select select = new Select(getElement(by));
		select.selectByVisibleText(visibleText);
	}

	private WebElement getElement(By by) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(200));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

}
