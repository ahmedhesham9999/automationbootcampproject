package com.makemytrip.pages.Search;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.makemytrip.pages.BasePage;

public class SearchPage extends BasePage implements ISearchPage {

	@Override
	public void openLocation() {
		// TODO Auto-generated method stub
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//input[@data-cy='city']"))).doubleClick().build().perform();

	}

	@Override
	public void enterCity(String city) {
		// TODO Auto-generated method stub
		fillText(CITY, city);
	}

	@Override
	public void keyActions() {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkinDate() {

		// TODO Auto-generated method stub
		click(CHECKIN_DATE);

	}

	@Override
	public void checkoutDate() {
		// TODO Auto-generated method stub
		click(CHECKOUT_DATE);
	}

	@Override
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
	public void childrenNumber(int roomNumber) {
		// TODO Auto-generated method stub
		click(By.xpath("//ul[@class=\"guestCounter font12 darkText\"][2]/li[" + roomNumber + "]"));
	}

	@Override
	public void selectChildAge1(String age) {
		// TODO Auto-generated method stub
		selectFromDropdown(AGE_DROPDOWN1, age);
	}

	@Override
	public void selectChildAge2(String age) {
		// TODO Auto-generated method stub
		selectFromDropdown(AGE_DROPDOWN2, age);
	}

	@Override
	public void clickApply() {
		// TODO Auto-generated method stub
		moveToElement(APPLY_BUTTON);
	}

	@Override
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

	/*
	 * @Override public void adultCount() { // TODO Auto-generated method stub
	 * 
	 * }
	 */
	@Override
	public void childAge() {
		// TODO Auto-generated method stub

	}
	/*
	 * @Override public void clickSearchButton() { // TODO Auto-generated method
	 * stub
	 * 
	 * 
	 * }
	 */

	@Override
	public void select_text() {
		// TODO Auto-generated method stub

		click(LIST_NAME);

	}

	@Override
	public void keydown() {
		/*
		 * I// TODO Auto-generated method stub Actions action = new Actions((WebDriver)
		 * driver.findElement(By.id("react-autowhatever-1")));
		 * action.keyDown(Keys.ARROW_DOWN).click(); action.build().perform();
		 */
		go(list);

	}

	@Override
	public void key_down(By CITY_LIST) {
		// TODO Auto-generated method stub

	}

}
