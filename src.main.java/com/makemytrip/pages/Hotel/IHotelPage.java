package com.makemytrip.pages.Hotel;

import org.openqa.selenium.By;

public interface IHotelPage {
//By CITY_NAME= By.id("city");
	/*
	 * By OPTION1 = By.xpath("//input[@id='₹ 0 - ₹ 2500']"); By OPTION2 =
	 * By.xpath("//input[@id='₹ 2000 - ₹ 3000']"); By OPTION3 =
	 * By.xpath("//input[@id='₹ 3000 - ₹ 5500']"); By OPTION4 =
	 * By.xpath("//input[@id='₹ 5500 - ₹ 30000']"); By OPTION5 =
	 * By.xpath("//input[@id='₹ 30000+']");
	 */
	By MINPRICE_FILTER = By.xpath("//input[@placeholder='Min']");
	By MAXPRICE_FILTER = By.xpath("//input[@placeholder='Max']");
	By APPLYPRICEFILTER_BUTTON = By.xpath("//button[contains(@class, 'btnRangeGo')]");
	By USERRATING = By.xpath("//div[@id='USER_RATING']/ul/li[2]");
	By HOTELNAME = By.xpath("//p[@id='hlistpg_hotel_name']/span[1]");
	By ROOMS_BUTTON = By.xpath("//a[@class='navLink']");

	void enterMinPriceFilterValue(String minPrice);

	void enterMaxPriceFilterValue(String maxPrice);

	void clickOnApplyPriceFilter();

	void userRating();

	void chooseHotel(String hotel);

	void captureHotelName(String hotelnumber);

	void openRooms();
}
