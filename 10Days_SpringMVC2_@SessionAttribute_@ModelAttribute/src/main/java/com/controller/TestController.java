package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.entity.LoginDTO;

@Controller
@SessionAttributes("kkk")
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
	
	@ModelAttribute("kkk")
	public void init(HttpServletRequest req)
	{
		HttpSession session=req.getSession();
		session.setAttribute("kkk",new LoginDTO());
		
		
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String aaa2(
			@ModelAttribute("kkk") LoginDTO dto
			,HttpSession sess)
	{
		
		System.out.println(dto);
		System.out.println("bbb");
		return "info";
	}
	
}
