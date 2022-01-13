package org.frcteam5066.common;

import org.frcteam5066.common.Logger;
import org.junit.Test;

import java.io.IOException;

public class LoggerTest {
	@Test
	public void test() {
		Logger logger = new Logger(LoggerTest.class);

		logger.info("Message 1");
		logger.warn("Message 2");
		logger.error(new IOException("Failed to not fail!"));
		logger.debug("Debugging message!");
		Logger.getAnonymousLogger().error("Test");
	}
}
