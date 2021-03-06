package com.controller;

import org.junit.runner.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	// return -> model and view

	@RequestMapping("/yyy")
	//http://localhost:8090/app/yyy
//
	public String yyyy() {
		
		System.out.println("yyyyy");
		// return 값은 view 이름
		return "Hello";
	}

	@RequestMapping("/bbb/*")
	//http://localhost:8090/app/yyy
//
	public String bbbb() {
		
		System.out.println("bbbb");
		// return 값은 view 이름
		return "Hello";
	}
	@RequestMapping("/ccc*")
	//http://localhost:8090/app/yyy
//
	public String cccc() {
		
		System.out.println("ccc");
		// return 값은 view 이름
		return "Hello";
	}

	@RequestMapping("/dddd/**/fff")
	//http://localhost:8090/app/yyy
//
	public String ddd() {
		
		System.out.println("ddd");
		// return 값은 view 이름
		return "Hello";
	}

	@RequestMapping({"/eee","/eee2"})
	//http://localhost:8090/app/yyy
//
	public String eee() {
		
		System.out.println("eee");
		// return 값은 view 이름
		return "Hello";
	}
	//Restful 형식
	//http://localhost:8090/app/userid/kkk/age/20 + 의도 동작 정보 (method)
	// 
	@RequestMapping(value="/userid/{xxx}/age/{xxx2}")
	//http://localhost:8090/app/yyy
//
	public String fff(@PathVariable String xxx,@PathVariable String xxx2) {
		System.out.println(xxx+"\t"+xxx2);
		System.out.println("fff");
		// return 값은 view 이름
		return "Hello";
	}

}
