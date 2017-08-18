package org.codelabor.example.lang;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SystemTest {
	private static final Logger logger = LoggerFactory.getLogger(SystemTest.class);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetEnv() {
		Map<String, String> envMap = System.getenv();
		Set<String> keys = envMap.keySet();
		Iterator<String> iter = keys.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			logger.info("env key: {}, value: {}", key, envMap.get(key));
		}
	}

	@Test
	public void testGetProperties() {
		Properties props = System.getProperties();
		Set keys = props.keySet();
		Iterator iter = keys.iterator();
		while (iter.hasNext()) {
			String key = (String) iter.next();
			logger.info("proeprty key: {}, value: {}", key, props.get(key));
		}
	}

	@Test
	public void testNanoTime() {
		long startTime = System.nanoTime();
		long endTime = System.nanoTime();
		logger.info("elapsed time: {} nanosecond", endTime - startTime);
	}

}
