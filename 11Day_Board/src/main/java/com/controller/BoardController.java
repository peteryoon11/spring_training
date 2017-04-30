package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.DeptDTO;
import com.service.DeptService;

@Controller
public class BoardController {

	@Autowired
	private DeptService service;
	
	@RequestMapping("/list") 
	@ModelAttribute("xxx")
	public List<DeptDTO> list(){
        List<DeptDTO> list = service.select();
		return list;
	}

}
