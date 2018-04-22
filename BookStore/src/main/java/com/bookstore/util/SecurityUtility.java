package com.bookstore.util;

import java.security.SecureRandom;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class SecurityUtility {

	private static final String SALT = "salt";
	
//	public static String cryptPasswordEncoder(String password) {
//		return new BCryptPasswordEncoder().encode(password);
//	}

	@Bean
	public static BCryptPasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder(12, new SecureRandom(SALT.getBytes()));
	}
	
}
