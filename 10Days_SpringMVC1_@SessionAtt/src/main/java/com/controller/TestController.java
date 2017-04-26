package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller

@SessionAttributes(value={"sess","myCommand"})

public class TestController {
	// return -> model and view
	@RequestMapping("/aaa")
	public String kkk3(Model sess) 
	{
		
		sess.addAttribute("myCommand","홍길동");
		
		return "aaa";
	}
	@RequestMapping("/info")
	public String kkk4() 
	{
		
		
		return "info";
	}
	
	@RequestMapping("/invalidate")
	public String kkk5(SessionStatus status) 
	{
		status.setComplete();
		
		return "info2";
	}

	/*	
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
	*/
}
