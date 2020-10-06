package com.rajuit;

import java.util.Base64;

public class EncodeDecodeUtil {

	public String encodeString(String plainText) {
		String encodeString = Base64.getEncoder().encodeToString(plainText.getBytes());
		return encodeString;

	}

	public String decodeString(String encodedText) {
		byte[] byteArr = Base64.getDecoder().decode(encodedText);
		
		return new String(byteArr);

	}

}
