package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	// return -> model and view

	@RequestMapping("/aaa")
	//http://localhost:8090/app/yyy
//
	public String yyyy() {
		
		System.out.println("yyyyy");
		// return 값은 view 이름
		return "Hello";
	}

}
