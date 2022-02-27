package com.makemytrip.pages.Hotel;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.makemytrip.pages.BasePage;

public class HotelPage extends BasePage implements IHotelPage {
	public void validate_CityName(String actualText) {
		/*
		 * assertTrue(actualText, driver.findElement(By.
		 * xpath("//input[@class='hsw_inputField font16 whiteText']"))
		 * .getAttribute("value"));
		 */
		assertResult(actualText, driver.findElement(By.xpath("//input[@class='hsw_inputField font16 whiteText']"))
				.getAttribute("value"));

	}

	public void validate_CheckinDate(String actualText) {
		assertResult(actualText, driver.findElement(By.xpath("//input[@id='checkin']")).getAttribute("value"));

	}

	public void validate_CheckoutDate(String actualText) {
		assertResult(actualText, driver.findElement(By.xpath("//input[@id='checkout']")).getAttribute("value"));

	}

	public void validate_RoomsGuests(String actualText) {
		assertResult(actualText, driver.findElement(By.xpath("//input[@id='guest']")).getAttribute("value"));

	}

	/*
	 * @Override public void applyPriceFilter() {
	 */
	// TODO Auto-generated method stub
	/*
	 * WebDriverWait wait = new WebDriverWait(driver, 60);
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
	 * xpath("//input[@id ='Under ₹ 2000']")));
	 */
	/* click(By.xpath("//input[@id ='Under ₹ 2000']")); */
	/*
	 * scrollIntoView(OPTION1); moveToElement(OPTION1);
	 */
	/*
	 * scrollIntoView(driver);
	 * 
	 * click(OPTION1); }
	 */

	@Override
	public void enterMinPriceFilterValue(String minPrice) {
		// TODO Auto-generated method stub
		fillText(MINPRICE_FILTER, minPrice);

	}

	@Override
	public void enterMaxPriceFilterValue(String maxPrice) {
		// TODO Auto-generated method stub
		fillText(MAXPRICE_FILTER, maxPrice);

	}

	@Override
	public void clickOnApplyPriceFilter() {
		// TODO Auto-generated method stub
		click(APPLYPRICEFILTER_BUTTON);
	}

	@Override
	public void userRating() {
		// TODO Auto-generated method stub
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(USERRATING));
		actions.build().perform();
		actions.doubleClick(driver.findElement(USERRATING)).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("USERRATING")));

		click(USERRATING);
	}

	@Override
	public void chooseHotel(String hotel) {
		// TODO Auto-generated method stub
		click(By.xpath("//div[@id='Listing_hotel_" + hotel + "']"));

	}

	@Override
	public void captureHotelName(String hotelnumber) {
		// TODO Auto-generated method stub
		System.out.println(driver.findElement(By.xpath("//div[@id='Listing_hotel_" + hotelnumber + "']")).getText());
	}

	@Override
	public void openRooms() {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, 100);
		windowHandle();
		// scrollDown();
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("ROOMS_BUTTON")));

		/*
		 * Actions actions = new Actions(driver);
		 * actions.moveToElement(driver.findElement(ROOMS_BUTTON));
		 * actions.click().build().perform();
		 */
		// click(ROOMS_BUTTON);

	}

	@Override
	public void selectRooms() {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("SELECTROOM_BUTTON")));
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[@class='bookNowBtn ']/a']")));
		action.click().build().perform();
		// click(SELECTROOM_BUTTON);
	}

}
