package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
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
	if(true)
		throw new NullPointerException("error 발생!!");
	
		return "Hello";
	}
	@RequestMapping("/bbb")
	//http://localhost:8090/app/yyy
//
	public String bbb1() {
		
		System.out.println("yyyyy");
		// return 값은 view 이름
	int a=5/0;
		return "Hello";
	}
	
}
