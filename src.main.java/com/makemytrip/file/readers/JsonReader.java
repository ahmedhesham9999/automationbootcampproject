package com.makemytrip.file.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.makemytrip.bo.SearchBO;

public class JsonReader implements IReader {

	private String filePath = "src/test/resources/data.json";

	private static List<SearchBO> SearchCredentialsList = new ArrayList<SearchBO>();

	@Override
	public void read() {
		FileReader reader = null;

		try {
			reader = new FileReader(new File(filePath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// represents entire file

		JsonElement jsonElement = JsonParser.parseReader(reader);

		JsonArray jsonArray = jsonElement.getAsJsonArray();

		for (Object object : jsonArray) {
			JsonObject jsonObject = (JsonObject) object;

			SearchBO search = new SearchBO();
			search.setCityName(getDataFromObject(jsonObject, "cityName"));
			search.setRoomNumber(getDataFromObject(jsonObject, "roomNumber"));
			search.setChildrenRoom(getDataFromObject(jsonObject, "childrenRoom"));
			search.setMinPrice(getDataFromObject(jsonObject, "minPrice"));
			search.setMaxPrice(getDataFromObject(jsonObject, "maxPrice"));
			search.setHotel(getDataFromObject(jsonObject, "hotel"));
			search.setHotelnumber(getDataFromObject(jsonObject, "hotelnumber"));

			SearchCredentialsList.add(search);

		}
	}

	/*
	 * List<Integer> childrensAgeList = new ArrayList<Integer>();
	 * 
	 * JsonArray ageArray = jsonObject.get("childrensAge").getAsJsonArray();
	 * SearchBO search = new SearchBO(); search.setChildrenRoom(ageArray.size());
	 * System.out.println(ageArray.size());
	 * 
	 * for (JsonElement age : ageArray) { childrensAgeList.add(age.getAsInt()); }
	 * 
	 * search.setChildrensAge(childrensAgeList); SearchCredentialsList.add(search);
	 * }
	 */
	public static List<SearchBO> getSearchCredentials() {
		return SearchCredentialsList;
	}

	private static String getDataFromObject(JsonObject jsonObject, String jsonKey) {
		System.out.println(jsonObject.get(jsonKey));
		return jsonObject.get(jsonKey).toString().replaceAll("\"", "");
	}

	@Test
	public void test() {
		JsonReader reader = new JsonReader();
		reader.read();
		System.out.println(SearchCredentialsList);

	}

}
