package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	
	@RequestMapping
	public String bbbb() {
		
		System.out.println("bbbb");
		// return 값은 view 이름
		return "Hello";
	}

}
