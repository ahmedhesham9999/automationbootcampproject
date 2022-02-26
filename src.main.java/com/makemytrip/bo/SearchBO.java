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
	int childrenRoom;

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
