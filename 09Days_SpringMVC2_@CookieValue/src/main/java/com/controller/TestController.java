package com.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/abc")

	public String xxxx2(HttpServletRequest request) {

		
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			// System.out.println(cookie);
			String key = cookie.getName();
			String value = cookie.getValue();
			System.out.println(key + " = " + value);
		}

		// return 값은 view 이름
		return "Hello";
	}

	@RequestMapping("/abc2")

	public String xxxx(@CookieValue(value = "JSESSIONID", required = false, defaultValue = "N") String mesg) {
		System.out.println(mesg);

		System.out.println("xxxx2");
		// return 값은 view 이름
		return "Hello";
	}

}
