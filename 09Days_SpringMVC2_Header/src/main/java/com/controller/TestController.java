package com.controller;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/abc")

	public String xxxx2(HttpServletRequest request) {

		Enumeration<String> enu = request.getHeaderNames();
	
		while (enu.hasMoreElements()) {
			String key = enu.nextElement();
			String value = request.getHeader(key);
			System.out.println(key + "=" + value + " //");
		}

		System.out.println("xxxx2");
		// return 값은 view 이름
		return "Hello";
	}

	
	@RequestMapping("/abc2")

	public String xxxx(@RequestHeader("host") String mesg) {
		System.out.println(mesg);

		System.out.println("xxxx2");
		// return 값은 view 이름
		return "Hello";
	}

}
