package com.controller;

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

}
