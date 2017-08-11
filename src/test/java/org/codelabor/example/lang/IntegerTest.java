package org.codelabor.example.lang;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IntegerTest {
	private static Logger logger = LoggerFactory.getLogger(IntegerTest.class);

	@Test
	public void testToStringIntInt() {
		logger.info("Integer.MAX_VALUE: {}, radix: 10", Integer.toString(Integer.MAX_VALUE));
		logger.info("Integer.MAX_VALUE: {}, radix: 2", Integer.toString(Integer.MAX_VALUE, 2));
		logger.info("Integer.MAX_VALUE: {}, radix: 8", Integer.toString(Integer.MAX_VALUE, 8));
		logger.info("Integer.MAX_VALUE: {}, radix: 16", Integer.toString(Integer.MAX_VALUE, 16));


		logger.info("Integer.MIN_VALUE: {}, radix: 10", Integer.toString(Integer.MIN_VALUE));
		logger.info("Integer.MIN_VALUE: {}, radix: 2", Integer.toString(Integer.MIN_VALUE, 2));
		logger.info("Integer.MIN_VALUE: {}, radix: 8", Integer.toString(Integer.MIN_VALUE, 8));
		logger.info("Integer.MIN_VALUE: {}, radix: 16", Integer.toString(Integer.MIN_VALUE, 16));
	}

	@Test
	public void testToUnsignedStringIntInt() {
		logger.info("Integer.MAX_VALUE: {}, radix: 10", Integer.toUnsignedString(Integer.MAX_VALUE));
		logger.info("Integer.MAX_VALUE: {}, radix: 2", Integer.toUnsignedString(Integer.MAX_VALUE, 2));
		logger.info("Integer.MAX_VALUE: {}, radix: 8", Integer.toUnsignedString(Integer.MAX_VALUE, 8));
		logger.info("Integer.MAX_VALUE: {}, radix: 16", Integer.toUnsignedString(Integer.MAX_VALUE, 16));

		logger.info("Integer.MIN_VALUE: {}, radix: 10", Integer.toUnsignedString(Integer.MIN_VALUE));
		logger.info("Integer.MIN_VALUE: {}, radix: 2", Integer.toUnsignedString(Integer.MIN_VALUE, 2));
		logger.info("Integer.MIN_VALUE: {}, radix: 8", Integer.toUnsignedString(Integer.MIN_VALUE, 8));
		logger.info("Integer.MIN_VALUE: {}, radix: 16", Integer.toUnsignedString(Integer.MIN_VALUE, 16));
	}

	@Test
	public void testToHexString() {
		logger.info("Integer.MAX_VALUE: {}", Integer.toHexString(Integer.MAX_VALUE));
		logger.info("Integer.MIN_VALUE: {}", Integer.toHexString(Integer.MIN_VALUE));
	}

	@Test
	public void testToOctalString() {
		logger.info("Integer.MAX_VALUE: {}", Integer.toOctalString(Integer.MAX_VALUE));
		logger.info("Integer.MIN_VALUE: {}", Integer.toOctalString(Integer.MIN_VALUE));
	}

	@Test
	public void testToBinaryString() {
		logger.info("Integer.MAX_VALUE: {}", Integer.toBinaryString(Integer.MAX_VALUE));
		logger.info("Integer.MIN_VALUE: {}", Integer.toBinaryString(Integer.MIN_VALUE));
	}

}
