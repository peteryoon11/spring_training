package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	// return -> model and view

	@RequestMapping("/")
	public String kkk() 
	{
		
		System.out.println("loginform");
		return "main";
	}
// applic/login?type=xxx
//	consumes, produces
	@RequestMapping(value = "/login",params="type=xxx",method=RequestMethod.GET)
	public String aaa() 
	{
		System.out.println("aaa xxx");
		return "Hello";
	}

	@RequestMapping(value = "/login",params="type=yyy")
	public String aaa2() 
	{
		System.out.println("bbb yyy");
		return "Hello";
	}
	@RequestMapping(value = "/login",params="type")
	public String aaa3() 
	{
		System.out.println("bbb333 type");
		return "Hello";
	}
	
	@RequestMapping(value = "/login",params="!type")
	public String aaa4() 
	{
		System.out.println("bbb333 ! type");
		return "Hello";
	}
	
	@RequestMapping(value = "/login")
	public String aaa5() 
	{
		System.out.println("empty");
		return "Hello";
	}
}
