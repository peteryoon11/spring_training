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
	
	//3. 글쓰기 
		@RequestMapping("/write") 
		public String write(DeptDTO dto){
            service.insert(dto);
			//return "list"; //list.jsp
			return "redirect:list"; // /list
		}
		
	//2. 글쓰기 화면보기
	@RequestMapping("/writeUI") 
	public String writeUI(){

		return "write"; //write.jsp
	}
	
	
	//1.목록보기
	@RequestMapping("/list") 
	@ModelAttribute("xxx")
	public List<DeptDTO> list(){
        List<DeptDTO> list = service.select();
		return list;
	}

}
