package com.makemytrip.pages.Search;

import org.openqa.selenium.By;

public interface ISearchPage {

	// By LOCATION = By.xpath("//label[@for='city']");

	By CITY = By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']");
	/*
	 * By CITY_LIST = By.xpath(
	 * "//div[@class=\"react-autosuggest__section-container react-autosuggest__section-container--first\"]"
	 * );
	 */
	By list = By.xpath("//ul[@class='react-autosuggest__suggestions-list']");
	// By CHECKIN = By.xpath("//input[@id = 'checkin']");
	By CHECKIN_DATE = By.xpath("//div[@aria-label='Sun Feb 27 2022']");
	By CHECKOUT_DATE = By.xpath("//div[@aria-label=\"Thu Mar 03 2022\"]");

	By LIST_NAME = By.xpath("//p[contains(text(),'Mumbai, Maharashtra, India')]");

	By CHECKOUT = By.xpath("//input[@id = 'checkout']");
	By GUESTROOMS = By.xpath(" //label[@for='guest']");
	By ROOM = By.xpath("//li[@data-cy='adults]");
	By AGE_DROPDOWN1 = By.xpath("//select[@data-cy='childAge-0']");
	By AGE_DROPDOWN2 = By.xpath("//select[@data-cy='childAge-1']");
	By APPLY_BUTTON = By.xpath("//button[@data-cy='submitGuest']");

	By TRAVELFOR_DROPDOWN = By.xpath("//input[@data-cy='travelFor']");
	By TRAVELFORWORK = By.xpath("//li[@data-cy='travelFor-Work']");
	By TRAVELFORLEISURE = By.xpath("//li[@data-cy='travelFor-Leisure']");
	By SEARCH_BUTTON = By.id("hsw_search_button");

	By ADULTS_COUNT = By.cssSelector("ul[data-cy='adultCount']");
	By CHILDREN_COUNT = By.cssSelector("li[data-cy='children-0']"); // until I find a more accurate locator

	By CHILD_AGE = By.cssSelector("select[data-cy='childAge-0']");

	void openLocation();

	void enterCity(String city);

	void key_down(By CITY_LIST);

	void keyActions();

	// void select(WebElement element, String text);

	void checkinDate();

	void checkoutDate();

	void openGuestRoomNumber(String number);

	void childrenNumber(int roomNumber);

	void selectChildAge1(String age);

	void selectChildAge2(String age);

	void clickApply();

	void selectTravelFor(String text);

	void childAge();

	void select_text();

	void keydown();

}
