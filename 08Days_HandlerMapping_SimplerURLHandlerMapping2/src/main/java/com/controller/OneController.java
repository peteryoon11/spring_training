package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OneController {

	
	@RequestMapping("/one/list")
	public String bbbb() {
		
		System.out.println("one list oneController");
		// return 값은 view 이름
		return "Hello";
	}
	
	@RequestMapping("/one/list2")
	public String aaaa() {
		
		System.out.println("oneController2+ aaa");
		// return 값은 view 이름
		return "Hello";
	}

}
