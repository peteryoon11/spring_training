package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	
	@RequestMapping("/aaa") 
	public String xxxx(){
		System.out.println("aaa");
		return "hello";
	}
	@RequestMapping("/bbb") 
	public String bbb(Model aa){
		aa.addAttribute("xyz","홍길동");
		
		System.out.println("aaa");
		return "hello";
	}
	@RequestMapping("/ccc") 
	public String ccc(Model aa){
		aa.addAttribute("xyz","홍길동");
		
		System.out.println("aaa");
		return "redirect:aaa";
	}
	
}
