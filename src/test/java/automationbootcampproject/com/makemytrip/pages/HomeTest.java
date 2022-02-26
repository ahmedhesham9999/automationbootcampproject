package automationbootcampproject.com.makemytrip.pages;

import org.testng.annotations.Test;

import com.makemytrip.pages.Home.HomePage;

public class HomeTest extends BaseTest {
	@Test
	public void Home() {
		HomePage home = new HomePage();

		home.launch("https://www.makemytrip.com/");
		home.clickAction();
		home.openHotel();

	}

}
