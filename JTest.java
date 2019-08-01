package com.flexon.sai.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class JTest {
	@Test
	public void testSum() {
		System.out.println("sum j unit test");
		Integer x = 15;
		Integer y = 15;
		Integer expResult = 30;
		Integer result = IntegerCalculator.sum(x, y);
		assertEquals(expResult, result);
	}
	
	@Test
	public void testSub() {
		System.out.println("subtract j unit test");
		Integer x = 15;
		Integer y = 10;
		Integer expResult = 5;
		Integer result = IntegerCalculator.sub(x, y);
		assertEquals(expResult, result);
	}
	@Test
	public void testMult() {
		System.out.println("multiplication j unit test");
		Integer x = 3;
		Integer y = 5;
		Integer expResult = 15;
		Integer result = IntegerCalculator.mult(x, y);
		assertEquals(expResult, result);
	}
	@Test
	public void testDiv() {
		System.out.println("Division j unit test");
		Integer x = 15;
		Integer y = 5;
		Integer expResult = 3;
		Integer result = IntegerCalculator.div(x, y);
		assertEquals(expResult, result);
	}
	@Test
	public void testMod() {
		System.out.println("Modulus j unit test");
		Integer x = 15;
		Integer y = 4;
		Integer expResult = 3;
		Integer result = IntegerCalculator.mod(x, y);
		assertEquals(expResult, result);
	}
}
