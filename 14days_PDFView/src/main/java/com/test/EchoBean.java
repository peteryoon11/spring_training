package com.test;

public class EchoBean {
	
	
	public String sayEcho() 
	{
	//	int a=2/0;
		System.out.println("sayEcho method");
		return "안녕하세요 ";
	}

	public EchoBean() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("echobean 생성자");
		
	}
}
