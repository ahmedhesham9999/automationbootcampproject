package com.makemytrip.externalservers;

public class DBManager {
	private static DBManager manager; // 101

	private DBManager() {

	}

	public static DBManager connect() {
		if (manager == null) {
			manager = new DBManager();
		}
		System.out.println(manager);
		return manager;
	}

	public void runQuery(String sqlQuery) {

	}

	public static void closeConnection() {
		if (manager != null) {

		}
	}
}
