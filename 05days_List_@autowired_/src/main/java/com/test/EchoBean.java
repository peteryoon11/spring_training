package com.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class EchoBean {

	// private AnotherBean anotherBean;
	@Autowired
	
	private List<AnotherBean> xxx;

	public List<AnotherBean> getXxx() {
		return xxx;
	}

	public void setXxx(List<AnotherBean> xxx) {
		this.xxx = xxx;
	}

	public EchoBean() {
		super();
		
		System.out.println("echobean 생성자  " + this.xxx);
		// TODO Auto-generated constructor stub
	}

}
