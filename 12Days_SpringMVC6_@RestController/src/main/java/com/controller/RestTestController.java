package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.LoginDTO;

@RestController

//@SessionAttributes(value = { "sess", "myCommand" })

public class RestTestController {
	@RequestMapping("/aaa")
	public String aaa() {
		return "aaa";
	}

	@RequestMapping("/abc")
	public String aaa1() {
		return "home";
	}

	@RequestMapping
	public LoginDTO bbb(){
		LoginDTO dto=new LoginDTO();
		dto.setUserid("ddd");
		dto.setPasswd("1234");
		return dto;
	}
	
}
