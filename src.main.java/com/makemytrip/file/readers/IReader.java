package com.makemytrip.file.readers;

public interface IReader {
	/*
	 * default List<JsonObject> read() { return null; }
	 * 
	 * default List<JsonObject> read(String filepath) { return null; }
	 */

	default void read() {

	}

	default void read(String filePath) {
	}
}
