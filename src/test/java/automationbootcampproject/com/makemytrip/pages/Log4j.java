package automationbootcampproject.com.makemytrip.pages;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log4j {
	private static final Logger logger = LogManager.getLogger(Log4j.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();
		logger.info("Starting with log printing");
		logger.error("Unspported browser");
		logger.debug("Displayed while debugging");
	}
}
