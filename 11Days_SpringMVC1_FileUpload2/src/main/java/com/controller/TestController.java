package com.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.entity.FileDTO;

@Controller
public class TestController {
	// return -> model and view
	@RequestMapping("/")
	public String aaa() {
		
		
		return "uploadForm";
	}

	
	@RequestMapping("upload")
	public ModelAndView bbb(FileDTO dto)
	{
		
		String theText=dto.getTheText();
		CommonsMultipartFile theFile=dto.getTheFile();
		long size=theFile.getSize();
		String fileName=theFile.getOriginalFilename();
		String contentType=theFile.getContentType();
		
		System.out.println(size);
		System.out.println(fileName);
		System.out.println(contentType);
		
		// 특정 폴더에 저장 
		File f=new File("c:\\upload",fileName);
		try {
			theFile.transferTo(f);
		
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ModelAndView mav=new ModelAndView();
		mav.setViewName("upload");
		
		mav.addObject("size",size);
		mav.addObject("fileName",fileName);
		mav.addObject("contentType",contentType);
		mav.addObject("theText",theText);
		
		return mav;
	}
}
