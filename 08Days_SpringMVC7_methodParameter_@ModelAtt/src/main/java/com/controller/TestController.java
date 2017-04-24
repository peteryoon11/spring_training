package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entity.LoginDTO;

@Controller
public class TestController {
	// return -> model and view

	@RequestMapping("/")
	public String kkk() {

		System.out.println("loginform");
		return "main";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String aaa() {
		System.out.println("aaa");
		return "loginForm";

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String aaa2(@ModelAttribute LoginDTO dto)

	{
		System.out.println(dto);
		
		// System.out.println(userid+"\t"+pw);
		System.out.println("bbb");
		return "Hello";
	}
}
