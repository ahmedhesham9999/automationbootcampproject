package automationbootcampproject.com.makemytrip.pages;

import org.testng.annotations.Test;

import com.makemytrip.bo.SearchBO;
import com.makemytrip.pages.Hotel.HotelPage;

import automationbootcampproject.com.makemytrip.dataproviders.SearchDataProvider;

public class HotelTest {
	@Test(dataProvider = "getSearchData", dataProviderClass = SearchDataProvider.class)
	public void SearchWithDataProvider(SearchBO searchBO) throws InterruptedException {
		HotelPage hotel = new HotelPage();

		/*
		 * hotel.validate_CityName("Mumbai, Maharashtra,...");
		 * hotel.validate_CheckinDate("Sun, 27 Feb 2022");
		 * hotel.validate_CheckoutDate("Thu, 3 Mar 2022");
		 */

		hotel.enterMinPriceFilterValue(searchBO.getMinPrice());
		hotel.enterMaxPriceFilterValue(searchBO.getMaxPrice());
		hotel.clickOnApplyPriceFilter();
		// hotel.userRating();
		hotel.chooseHotel(searchBO.getHotel());
		hotel.captureHotelName(searchBO.getHotelnumber());
		hotel.openRooms();
		hotel.selectRooms();
	}
}
