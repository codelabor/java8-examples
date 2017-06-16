package org.codelabor.example.time.format;

import static org.junit.Assert.fail;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateTimeFormatterTest {
	private static final Logger logger = LoggerFactory.getLogger(DateTimeFormatterTest.class);
	DateTimeFormatter formatter;
	LocalDate date;

	@Before
	public void setup() {
		formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd");
		date = LocalDate.now();
	}

	@Test
	public void testToString() {
		String string = date.format(formatter);
		logger.debug("date format: {}", string);
		logger.debug("formatter toString: {}", formatter.toString());
	}

	@Test
	public void testGetLocale() {
		logger.debug("formatter getLocale: {}", formatter.getLocale());
	}

	@Test
	public void testGetDecimalStyle() {
		logger.debug("formatter getDecimalStyle: {}", formatter.getDecimalStyle());
	}

	@Test
	public void testGetChronology() {
		logger.debug("formatter getChronology: {}", formatter.getChronology());
	}

	@Test
	public void testGetZone() {
		logger.debug("formatter getZone: {}", formatter.getZone());
	}

}
