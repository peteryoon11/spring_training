package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	// return -> model and view

	@RequestMapping("/aaa")
	public String yyyy() {
		
		System.out.println("yyyyy");
	if(true)
		throw new NullPointerException("error 발생!!");
	
		return "Hello";
	}
	@RequestMapping("/bbb")
	public String bbb1() {
		
		System.out.println("yyyyy");
		// return 값은 view 이름
	int a=5/0;
		return "Hello";
	}
	@ExceptionHandler(ArithmeticException.class)
	public String bbb2()
	{
		
		return "error_handle";
	}
	
	@ExceptionHandler({NullPointerException.class,ArrayIndexOutOfBoundsException.class})
	public String bbb()
	{
		
		System.out.println("error_Handle!!");
		return "error_handle";
	}
}
