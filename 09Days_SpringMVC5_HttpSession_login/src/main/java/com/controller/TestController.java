package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
	// return -> model and view
	@RequestMapping("/logout")
	public String kkk3(HttpSession sess) 
	{
		sess.invalidate();
		return "loginForm";
	}
	@RequestMapping("/")
	public String kkk() 
	{
		
		System.out.println("loginform");
		return "main";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String aaa() 
	{
		System.out.println("aaa");
		return "loginForm";
		
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String aaa2(@RequestParam String userid, 
			@RequestParam(value="passwd",required=false, defaultValue="12fff") String pw
			
			,HttpSession sess)
	{
		
		System.out.println(userid+"\t"+pw);
		sess.setAttribute("id", userid);
		sess.setAttribute("pw", pw);
		
		System.out.println("bbb");
		return "info";
	}
	
}
