package automationbootcampproject.com.makemytrip.dataproviders;

import org.testng.annotations.DataProvider;

import com.makemytrip.file.readers.JsonReader;

public class SearchDataProvider {
	/*
	 * List<JsonObject> searchDataList = new ArrayList<>();
	 * searchDataList=JsonReader.read();
	 */
	@DataProvider
	public Object[][] getSearchData() {
		Object[][] object = new Object[JsonReader.getSearchCredentials().size()][1];
		for (int i = 0; i < JsonReader.getSearchCredentials().size(); i++) {
			object[i][0] = JsonReader.getSearchCredentials().get(i);
		}
		return object;
	}
}
