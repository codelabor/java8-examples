package org.codelabor.example.time;

import java.time.LocalDate;
import java.time.ZoneId;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Test;

public class LocalDateTest {
	private static final Logger logger = LoggerFactory.getLogger(LocalDateTest.class);

	@Test
	public void testNow() {
		logger.debug("now: {}", LocalDate.now());
		logger.debug("now: {}, system default zone id: {}", LocalDate.now(ZoneId.systemDefault()), ZoneId.systemDefault());
	}

}
