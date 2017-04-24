package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	
	@RequestMapping("/test/list")
	public String bbbb() {
		
		System.out.println("test list bbbb");
		// return 값은 view 이름
		return "Hello";
	}
	@RequestMapping("/test/list2")
	public String bbbb2() {
		
		System.out.println("test list2 bbbb2");
		// return 값은 view 이름
		return "Hello";
	}

}
