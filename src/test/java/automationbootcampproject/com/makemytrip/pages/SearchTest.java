package automationbootcampproject.com.makemytrip.pages;

import org.testng.annotations.Test;

import com.makemytrip.bo.SearchBO;
import com.makemytrip.pages.Home.HomePage;
import com.makemytrip.pages.Search.SearchPage;

import automationbootcampproject.com.makemytrip.dataproviders.SearchDataProvider;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

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
	@Epic("Search Creation")
	@Story("Search Icon")
	@Feature("Show Hotels available")
	@Severity(SeverityLevel.NORMAL)
	public void SearchWithDataProvider(SearchBO searchBO) throws InterruptedException {
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
		search.selectTravelFor(searchBO.getTravel1());
		// search.selectTravelFor("Leisure");

		/*
		 * HotelPage hotel = new HotelPage();
		 * 
		 * 
		 * hotel.validate_CityName("Mumbai, Maharashtra,...");
		 * hotel.validate_CheckinDate("Sun, 27 Feb 2022");
		 * hotel.validate_CheckoutDate("Thu, 3 Mar 2022");
		 * 
		 * hotel.enterMinPriceFilterValue(searchBO.getMinPrice());
		 * hotel.enterMaxPriceFilterValue(searchBO.getMaxPrice());
		 * hotel.clickOnApplyPriceFilter(); // hotel.userRating();
		 * hotel.chooseHotel(searchBO.getHotel());
		 * hotel.captureHotelName(searchBO.getHotelnumber()); hotel.openRooms();
		 * hotel.selectRooms();
		 */
	}

}
