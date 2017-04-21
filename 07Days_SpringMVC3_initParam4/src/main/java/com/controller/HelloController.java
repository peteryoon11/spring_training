package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.MyService;

@Controller
public class HelloController {
	// return -> model and view
	@Autowired
	private MyService service;
	
	@RequestMapping(value="/aaa")//http://localhost:8090/app/xxx
	public String xxxx()
	{
		service.mesg();
		System.out.println("aaaa");
		// return 값은 view 이름
		return "Hello";
	}

	@RequestMapping("/bbb")//http://localhost:8090/app/yyy

	public String yyyy() {
		service.mesg();
		System.out.println("bbbb");
		// return 값은 view 이름
		return "Hello";
	}

}
