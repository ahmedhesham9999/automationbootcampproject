package com.makemytrip.bo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString

public class SearchBO {
	@Getter
	@Setter
	String cityName;

	@Getter
	@Setter
	String roomNumber;

	@Getter
	@Setter
	String childrenRoom;

	@Getter
	@Setter
	String travel1;

	@Getter
	@Setter
	String travel2;
	@Getter
	@Setter
	String age1;
	@Getter
	@Setter
	String age2;
	@Getter
	@Setter
	String minPrice;
	@Getter
	@Setter
	String maxPrice;
	@Getter
	@Setter
	String hotel;
	@Getter
	@Setter
	String hotelnumber;

	/*
	 * public void setCheckinDate(String checkindate) { this.checkindate =
	 * checkindate; }
	 */

	/*
	 * public void getCheckindate(String checkoutDate) { this.checkoutDate =
	 * checkoutDate;
	 * 
	 * }
	 */

}
