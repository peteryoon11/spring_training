package com.test;

import org.springframework.beans.factory.annotation.Required;

public class EchoBean {

	private AnotherBean anotherBean;

	public EchoBean() {
		super();
		System.out.println("echobean 생성자  "+this.anotherBean);
		// TODO Auto-generated constructor stub
	}


	public AnotherBean getAnotherBean() {
		return anotherBean;
	}
	@Required
	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}
	
	
	
}
