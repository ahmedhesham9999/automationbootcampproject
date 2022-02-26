package com.makemytrip.pages.Hotel;

import org.openqa.selenium.By;
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

	@Override
	public void applyPriceFilter() {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id ='Under ₹ 2000']")));

		/* click(By.xpath("//input[@id ='Under ₹ 2000']")); */
		moveToElement(OPTION1);
		// click(OPTION1);
	}

}
