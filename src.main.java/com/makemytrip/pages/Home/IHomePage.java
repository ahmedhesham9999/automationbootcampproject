package com.makemytrip.pages.Home;

import org.openqa.selenium.By;

public interface IHomePage {
	By lOGO = By.xpath("//div[@class='loginModal displayBlock modalLogin dynHeight personal ']");
	By HOTELS = By.cssSelector("span.chHotels");

	void clickAction();

	void launch(String url);

	void openHotel();

}
