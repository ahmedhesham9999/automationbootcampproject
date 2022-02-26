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
