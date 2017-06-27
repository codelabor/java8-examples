package org.codelabor.example.util.function;

import java.util.function.Predicate;

import org.junit.Assert;
import org.junit.Test;

public class PredicateTest {
	
	Predicate<String> isBiggerThan5 = (a) -> a.length() > 5;
	Predicate<String> startsWith1 = (a) -> a.startsWith("1");

	@Test
	public void predicateTest() {
		
		Assert.assertTrue(isBiggerThan5.test("123456"));
		Assert.assertFalse(isBiggerThan5.test("12345"));
		
		Assert.assertTrue(startsWith1.test("12345"));
		Assert.assertFalse(startsWith1.test("2345"));
		
		Assert.assertTrue(isBiggerThan5.and(startsWith1).test("123456"));
		Assert.assertTrue(isBiggerThan5.or(startsWith1).test("12345"));
		Assert.assertTrue(isBiggerThan5.negate().test("2345"));
	}

}
