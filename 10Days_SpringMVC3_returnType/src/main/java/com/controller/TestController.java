package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller

@SessionAttributes(value={"sess","myCommand"})

public class TestController {
	// return -> model and view

	// 1. String -> 보여줄 view 이름으로 분석 aaa.jsp
	@RequestMapping("/aaa")
	public String kkk3(Model sess) 
	{
		
		sess.addAttribute("myCommand","홍길동");
		
		return "aaa";
	}
	
	
	// 2. ModelAndView ==> model 과 view 를 함께 저장가능.
	@RequestMapping("/info")
	public ModelAndView kkk4() 
	{
		ModelAndView mav=new ModelAndView();
		mav.setViewName("info"); // info.jsp 를 찾아라 
		
		mav.addObject("userid", "홍길동");
		mav.addObject("passwd", "adda");
		return mav;
	}
	// 3. Arraylist ==> model 로 분석 , view 정보 없다. mapping 값에서 찾음 . 
	@ModelAttribute("nnn")
	@RequestMapping(value="/abc")
	public ArrayList<String> kkk5(SessionStatus status) 
	{
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("123");
		list.add("456");
		list.add("홍길동");
		
		
		status.setComplete();
		
		return list;
	}

	
	
	@RequestMapping(value="/www")
	public void kkk6(Model mod) 
	{
		mod.addAttribute("key11", "key 입니다.");
		mod.addAttribute("key12", "key12 입니다.");
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("123");
		list.add("456");
		list.add("홍길동");
	System.out.println("www");	
		
		
	}

}
