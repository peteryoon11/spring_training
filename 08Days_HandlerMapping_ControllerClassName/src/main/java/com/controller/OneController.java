package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OneController {

	
	@RequestMapping
	public String bbbb() {
		
		System.out.println("oneController");
		// return 값은 view 이름
		return "Hello";
	}

}
