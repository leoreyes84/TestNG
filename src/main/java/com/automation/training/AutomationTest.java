package com.automation.training;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.Assert;

public class AutomationTest {
	
	@Parameters({"stringA","stringB"})
	@Test
	public void testConcat(String stringA, String stringB) {
		String result = stringA + stringB;
		Assert.assertEquals("I love test automation", result);
	}
	
	@Test(groups = {"grupo1"})
	public void testConcat3() {
		System.out.println("Test 3");
	}
	
	@Test(groups = {"grupo2", "grupo3"})
	public void testConcat4() {
		System.out.println("Test 4");
	}
	
	@Test(groups = {"grupo3"})
	public void testConcat5() {
		System.out.println("Test 5");
	}
	
	@Test(groups = {"grupo1"})
	public void testConcat6() {
		System.out.println("Test 6");
	}

}
