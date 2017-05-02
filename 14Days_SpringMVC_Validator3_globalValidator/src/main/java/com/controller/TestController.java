package com.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.LoginDTO;
import com.entity.MemberDTO;

@Controller
public class TestController {
	// return -> model and view

	@RequestMapping("/form")
	//http://localhost:8090/app/yyy
//
	public String yyyy(@ModelAttribute("xxx1") LoginDTO dto) {
		
		System.out.println("form");
		// return 값은 view 이름
		return "form";
	}
	@RequestMapping("/form2")
	//http://localhost:8090/app/yyy
//
	public String yyyy2(@ModelAttribute("yyy") MemberDTO dto) {
		
		System.out.println("form");
		// return 값은 view 이름
		return "form2";
	}
	
	@RequestMapping("/login")	
	public String login(@Valid @ModelAttribute("xxx1") LoginDTO dto
			,BindingResult error) {
		
		if(error.hasErrors())
		{
			return "form";
		}
		
		
		System.out.println("login");
		return "info";
	}

	@RequestMapping("/member")	
	public String member(@Valid @ModelAttribute("yyy") MemberDTO dto
			,BindingResult error) {
		
	
		if(error.hasErrors())
		{
			return "form2";
		}
		
		
		System.out.println("member");
		return "info";
	}


}
