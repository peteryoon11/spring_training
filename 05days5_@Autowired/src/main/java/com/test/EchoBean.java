package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class EchoBean {
	
	@Autowired

	private AnotherBean anotherBean;

//	@Autowired(required=false)
	public EchoBean() {
		super();
		System.out.println("echobean 생성자  " + this.anotherBean);
		// TODO Auto-generated constructor stub
	}

	public EchoBean(AnotherBean anotherBean) {
		super();
		//System.out.println("echobean 생성자  " + this.anotherBean);
		// TODO Auto-generated constructor stub
	}

	public AnotherBean getAnotherBean() 
	{
		return anotherBean;
	}

	@Autowired
	public void setAnotherBean(AnotherBean anotherBean) 
	{
		this.anotherBean = anotherBean;
	}

}
