package com.makemytrip.pages;

import java.time.Duration;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.makemytrip.drivermanager.DriverFactory;

public class BasePage {
	public WebDriver driver;

	public BasePage() {
		this.driver = DriverFactory.getDriverInstance();

	}
	/* a function using actions to a click on element */

	public void clickAction(By element) {
		Actions action = new Actions(driver);
		WebElement webElement = driver.findElement(element);
		action.moveToElement(webElement).click(webElement).build().perform();
	}

	/* Function to use key down using actions */
	public void keyActions(By element) {
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL);
		actions.keyDown(Keys.ENTER);

	}

	/* function to open the website by passing the url */
	protected void goToUrl(String url) {
		driver.get(url);
	}

	/* function used to write instead of sendKeys() */
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

	protected void moveToElement(By element) {
		Actions action = new Actions(driver);
		WebElement webElement = driver.findElement(element);
		action.moveToElement(webElement).click(webElement).build().perform();

	}

	/*
	 * protected void move(By element) { Actions action = new Actions(driver);
	 * WebElement webElement = driver.findElement(element);
	 * action.moveToElement(webElement).build().perform();
	 * 
	 * }
	 */

	public void select(By CITY_LIST, String text) {
		Select select = new Select((WebElement) CITY_LIST);
		select.selectByVisibleText(text);

	}

	protected void assertTrue(String actualText, String expectedText) {
		Assert.assertEquals(actualText, expectedText);
		// Assert.assertTrue(actualText.equals(expectedText));

	}

	protected void assertResult(String actualResult, String expectedResult) {
		Assert.assertTrue(actualResult.equals(expectedResult));
	}

	/***
	 * Wait for the element to be visible using the locator
	 * 
	 * @param locator, Locator used to check if the element is visible or not
	 * @return returns a webElement to perform an action on
	 */
	private WebElement getElement(By by) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(200));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	protected void waitForPageLoad() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("return document.readyState").equals("completed");
		/* js.executeScript("arguments[0].scrollIntoView(true)", element); */

	}

	public void go(By element) {
		driver.findElement(element).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(element).click();
	}

	public void windowHandle() {
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String w : allWindows) {
			if (w != parentWindow) {
				driver.switchTo().window(w);
			}

		}

	}

	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,1700)", "");

	}
}
