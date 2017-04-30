package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.DeptDTO;
import com.service.DeptService;

@Controller
public class BoardController {
	
	// return -> model and view
	@Autowired
	private DeptService service;
	
	@RequestMapping("/list")
	// 목록보기 
	@ModelAttribute("xxx")
	public List<DeptDTO> yyyy() {
		

		List<DeptDTO> list = service.select();		
		System.out.println("yyyyy");
		// return 값은 view 이름
		return list;
	}

}
