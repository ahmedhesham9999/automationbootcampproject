package com.makemytrip.file.manager;

import java.io.File;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class DirectoryManager {
	private static final Logger logger = LogManager.getLogger(DirectoryManager.class);

	public static void cleanDirectory(String... directoryNames) {
		logger.warn("Deleting existing directory and files.");
		for (String dir : directoryNames) {
			File outputDir = new File(dir);
			removeFiles(outputDir);
		}
	}

	/**
	 * Recursively delete all directory and files present in output folder
	 *
	 * @param outputDir directory object
	 */
	private static void removeFiles(File outputDir) {
		File[] files = outputDir.listFiles();
		if (files != null) {
			for (File file : files) {
				if (file.isDirectory()) {
					removeFiles(file);
					file.delete();
				} else {
					file.delete();
				}
			}
		}
		outputDir.delete();
	}
}
