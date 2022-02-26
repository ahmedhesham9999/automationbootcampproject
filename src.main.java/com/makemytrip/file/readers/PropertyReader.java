package com.makemytrip.file.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;

public class PropertyReader implements IReader {
	private String basePath = "src/main/resources/";
	private String configFilePath = basePath + "config.properties";
	private String environmentPath = basePath + "environments/";

	private static Properties properties = new Properties();

	public PropertyReader() {

		read(configFilePath);

		String env = getProperty("environmentToRun") + ".properties";

		read(environmentPath + env);
	}

	@Override
	public void read(String filePath) {
		File file = new File(filePath);

		try {
			FileReader reader = new FileReader(file);

			properties.load(reader);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String getProperty(String propertyKey) {
		return properties.getProperty(propertyKey);
	}

	@Test
	public void testProperties() {
		PropertyReader reader = new PropertyReader();
		System.out.println(getProperty("baseurl"));
	}
}
