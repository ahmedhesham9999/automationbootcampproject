package com.makemytrip.pages.Home;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.makemytrip.pages.BasePage;

import io.qameta.allure.Step;

public class HomePage extends BasePage implements IHomePage {

	private static final Logger logger = LogManager.getLogger(HomePage.class);

	@Override
	@Step
	public void launch(String url) {

		goToUrl(url);
	}

	@Override
	@Step
	public void openHotel() {
		// TODO Auto-generated method stub
		click(HOTELS);

	}

	@Override
	public void clickAction() {
		// TODO Auto-generated method stub
		click(lOGO);
	}

}
