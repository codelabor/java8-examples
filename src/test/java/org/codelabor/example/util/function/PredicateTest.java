package org.codelabor.example.util.function;

import java.util.function.Predicate;

import org.junit.Assert;
import org.junit.Test;

public class PredicateTest {

	@Test
	public void predicateTest() {
		Predicate<String> predicate1 = (a) -> a.length() > 5;
		Assert.assertFalse(predicate1.test("12345"));
		Assert.assertTrue(predicate1.test("123456"));
	}

}
