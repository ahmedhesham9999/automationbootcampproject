package automationbootcampproject.com.makemytrip.pages;

import org.testng.annotations.Test;

import com.makemytrip.bo.SearchBO;
import com.makemytrip.pages.Home.HomePage;
import com.makemytrip.pages.Hotel.HotelPage;
import com.makemytrip.pages.Search.SearchPage;

import automationbootcampproject.com.makemytrip.dataproviders.SearchDataProvider;

public class SearchTest extends BaseTest {

	/*
	 * public void search() throws InterruptedException { HomePage home = new
	 * HomePage(); home.launch("https://www.makemytrip.com/"); home.clickAction();
	 * home.openHotel();
	 * 
	 * SearchPage search = new SearchPage();
	 * 
	 * search.openLocation(); // search.enterCity("Mumbai");
	 * search.enterCity(SearchBO.getCityName()); search.select_text();
	 * 
	 * search.checkinDate(); search.checkoutDate();
	 * 
	 * search.openGuestRooms_RoomNumber(1); search.childrenNumber(3);
	 * search.selectChildAge1("5"); search.selectChildAge2("7");
	 * search.clickApply(); search.selectTravelFor("Leisure"); Thread.sleep(50);
	 * HotelPage hotel = new HotelPage();
	 * 
	 * 
	 * hotel.validate_CityName("Mumbai, Maharashtra,...");
	 * hotel.validate_CheckinDate("Sun, 27 Feb 2022");
	 * hotel.validate_CheckoutDate("Thu, 3 Mar 2022");
	 * hotel.validate_RoomsGuests("1 Room, 1 Adult, 2 Children");
	 * 
	 * hotel.applyPriceFilter();
	 */

	@Test(dataProvider = "getSearchData", dataProviderClass = SearchDataProvider.class)
	public void SearchWithDataProvider(SearchBO searchBO) {
		HomePage home = new HomePage();
		home.launch("https://www.makemytrip.com/");
		home.clickAction();
		home.openHotel();
		SearchPage search = new SearchPage();

		search.openLocation();
		search.enterCity(searchBO.getCityName());
		search.select_text();

		search.checkinDate();
		search.checkoutDate();
		search.openGuestRoomNumber(searchBO.getRoomNumber());
		search.childrenNumber(searchBO.getChildrenRoom());

		/* search.openGuestRoomNumber("2"); */
		// search.childrenNumber(2);
		search.selectChildAge1("5");
		search.selectChildAge2("7");
		search.clickApply();
		search.selectTravelFor("Leisure");

		HotelPage hotel = new HotelPage();
		hotel.applyPriceFilter();

		hotel.validate_CityName("Mumbai, Maharashtra,...");
		hotel.validate_CheckinDate("Sun, 27 Feb 2022");
		hotel.validate_CheckoutDate("Thu, 3 Mar 2022");

		hotel.applyPriceFilter();

	}

}
