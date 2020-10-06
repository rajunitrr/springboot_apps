package com.rajuit;

import static org.junit.Assert.assertNotNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class EncodeDecodeUtilTest {
	private static EncodeDecodeUtil encodeDecodeUtil = null;

	@BeforeClass
	public static void init() {
		encodeDecodeUtil=new EncodeDecodeUtil();
	}
	
	@Test
	public void test_encodeString() {
		String encodeString=encodeDecodeUtil.encodeString("rajuit");
		System.out.println(encodeString);
		assertNotNull(encodeString);
		
	}
	@Test
	public void test_decodeString() {
		String decodeString=encodeDecodeUtil.decodeString("cmFqdWl0");
		System.out.println(decodeString);
		assertNotNull(decodeString);
		
	}
	
	@AfterClass
	public static void destroy() {
		encodeDecodeUtil=null;
	}
}
