package com.mazurak.service.utils;

import org.apache.commons.lang.RandomStringUtils;

public class RandomToken {

	public static String generateToken() {
		return RandomStringUtils.randomAlphanumeric(30);
	}
	
	public static String generateToken(int count) {
		return RandomStringUtils.randomAlphanumeric(count);
	}
}
