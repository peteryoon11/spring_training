package com.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/abc")

	public String xxxx2(Model mod) {

		mod.addAttribute("key", "홍길동");
		
		System.out.println("xxxx2");
		// return 값은 view 이름
		return "Hello";
	}	
	
	@RequestMapping("/abc2")

	public String xxxx(Model mod) {

		List<String> list=Arrays.asList("홍길동","이순신");
		mod.addAttribute("key", list);
		
		System.out.println("xxxx2");
		// return 값은 view 이름
		return "Hello";
	}

}
