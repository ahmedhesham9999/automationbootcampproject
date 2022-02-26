package com.makemytrip.pages.Hotel;

import org.openqa.selenium.By;

public interface IHotelPage {
//By CITY_NAME= By.id("city");
	By OPTION1 = By.cssSelector("input[id='Under ₹ 2000']");
	By OPTION2 = By.xpath("//input[@id='₹ 2000 - ₹ 3000']");
	By OPTION3 = By.xpath("//input[@id='₹ 3000 - ₹ 5500']");
	By OPTION4 = By.xpath("//input[@id='₹ 5500 - ₹ 30000']");
	By OPTION5 = By.xpath("//input[@id='₹ 30000+']");

	void applyPriceFilter();

}
