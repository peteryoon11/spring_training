package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.LoginDTO;

@Controller
public class TestController {
	// return -> model and view

	@RequestMapping("/form")
	//http://localhost:8090/app/yyy
//
	public String yyyy(@ModelAttribute("xxx") LoginDTO dto) {
		
		System.out.println("form");
		// return 값은 view 이름
		return "form";
	}
	@RequestMapping("/login")	
	//http://localhost:8090/app/yyy
//
	
	public String yyyy2(@ModelAttribute("xxx") LoginDTO dto
			,BindingResult error) {
		
		/*if((dto.getPasswd()==null)||dto.getUserid()==null)
		{
			
		}
		*/
// validate 객체 생성
		new LoginDTOValidator().validate(dto, error);
	
		/*error.get
		*/
		if(error.hasErrors())
		{
			return "form";
		}
		
		
		System.out.println("login");
		// return 값은 view 이름
		return "info";
	}



}
