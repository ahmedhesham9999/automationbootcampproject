package com.makemytrip.pages.Search;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.makemytrip.pages.BasePage;

import io.qameta.allure.Step;

public class SearchPage extends BasePage implements ISearchPage {
	private static final Logger logger = LogManager.getLogger(SearchPage.class);

	@Override
	@Step
	public void openLocation() {
		// TODO Auto-generated method stub
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//input[@data-cy='city']"))).doubleClick().build().perform();

	}

	@Override
	@Step
	public void enterCity(String city) {
		// TODO Auto-generated method stub
		fillText(CITY, city);
	}

	@Override
	@Step
	public void keyActions() {
		// TODO Auto-generated method stub

	}

	@Override
	@Step
	public void checkinDate() {

		// TODO Auto-generated method stub
		click(CHECKIN_DATE);

	}

	@Override
	@Step
	public void checkoutDate() {
		// TODO Auto-generated method stub
		click(CHECKOUT_DATE);
	}

	@Override
	@Step
	public void openGuestRoomNumber(String number) {
		// TODO Auto-generated method stub
		click(GUESTROOMS);
		click(By.xpath("//ul[@data-cy='adultCount']/li[" + number + "]"));

	}

	/*
	 * @Override public void openGuestRooms_RoomNumber(String number) { // TODO }
	 * Auto-generated method
	 * 
	 * stub click(GUESTROOMS);
	 * 
	 * // click(By.xpath("//ul[@data-cy='adultCount' and text()='" + number +
	 * "']//")); // click(By.xpath("//li[@data-cy='adults-' + number + "]));
	 * click(By.xpath("//ul[@data-cy='adultCount']/li["+number+"]"));
	 * 
	 * // click(ROOM); }
	 */
	@Override
	@Step
	public void childrenNumber(String roomNumber) {
		// TODO Auto-generated method stub
		click(By.xpath("//ul[@class=\"guestCounter font12 darkText\"][2]/li[" + roomNumber + "]"));
	}

	@Override
	@Step
	public void selectChildAge1(String age) {
		// TODO Auto-generated method stub
		selectFromDropdown(AGE_DROPDOWN1, age);
	}

	@Override
	@Step
	public void selectChildAge2(String age) {
		// TODO Auto-generated method stub
		selectFromDropdown(AGE_DROPDOWN2, age);
	}

	@Override
	@Step
	public void clickApply() {
		// TODO Auto-generated method stub
		moveToElement(APPLY_BUTTON);
	}

	@Override
	@Step
	public void selectTravelFor(String text) {
		// TODO Auto-generated method stub\

		moveToElement(TRAVELFOR_DROPDOWN);

		if (text == "Work") {
			click(TRAVELFORWORK);
		} else {
			click(TRAVELFORLEISURE);
		}
		click(SEARCH_BUTTON);

	}

	@Override
	@Step
	public void select_text() {
		// TODO Auto-generated method stub

		click(LIST_NAME);

	}

	@Override
	@Step
	public void keydown() {
		/*
		 * I// TODO Auto-generated method stub Actions action = new Actions((WebDriver)
		 * driver.findElement(By.id("react-autowhatever-1")));
		 * action.keyDown(Keys.ARROW_DOWN).click(); action.build().perform();
		 */
		go(list);

	}

	@Override
	@Step
	public void key_down(By CITY_LIST) {
		// TODO Auto-generated method stub

	}

}
