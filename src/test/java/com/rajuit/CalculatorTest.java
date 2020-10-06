package com.rajuit;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	
	private  static  Calculater cal=null;
	
	@BeforeClass
	public  static void init() {
		cal=new Calculater();
	}

	@Test
	public void test_add() {
		Integer actual=cal.add(10, 20);
		Integer expected=30;
		assertEquals(expected, actual);
		
	}
	@Test
	public void test_mul() {
		Integer actual=cal.mul(10, 20);
		Integer expected=200;
		assertEquals(expected, actual);
		
	}
	@Test
	public void test_div1() {
		Integer actual=cal.div(100, 20);
		Integer expected=5;
		assertEquals(expected, actual);
		
	}
	@Ignore
	@Test(expected = ArithmeticException.class)
	public void test_div2() {
		Integer actual=cal.div(10, 0);
	
	}
	
	
	@AfterClass
	public  static void destory() {
		cal=null;
	}
}
