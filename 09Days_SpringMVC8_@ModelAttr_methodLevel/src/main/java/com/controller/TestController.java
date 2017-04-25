package com.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	// return -> model and view
//localhost:8090/app/abc/mesg/1234
	@ModelAttribute("xyz")
	public ArrayList<String> kkkk(
			@PathVariable String mesg
			)
	{
		System.out.println("modelattru!!");
		System.out.println(mesg+" >>>");
		ArrayList<String> list=new ArrayList<String>();
		list.add("dddd");
		list.add("fff");
		list.add("ggggdd");
				//(ArrayList<String>) Arrays.asList("abc","ccc","ccd");
		return list;
	}
	
	
	@RequestMapping("/abc/{mesg}")

	public String xxxx(@ModelAttribute("xyz") ArrayList<String> list) {

		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("xxxx");
		// return 값은 view 이름
		return "Hello";
	}

	@RequestMapping("/xxx")

	public String xxxx2(@ModelAttribute(value="xyz") ArrayList<String> list) {


		System.out.println("xxxx2");
		// return 값은 view 이름
		return "Hello";
	}

}
