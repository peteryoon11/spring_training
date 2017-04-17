package com.test;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

public class EchoBean {

	// private AnotherBean anotherBean;
	@Autowired
	private Set<AnotherBean> xxx;

	public Set<AnotherBean> getXxx() {
		return xxx;
	}

	public void setXxx(Set<AnotherBean> xxx) {
		this.xxx = xxx;
	}

	public EchoBean() {
		super();
		
		System.out.println("echobean 생성자  " + this.xxx);
		// TODO Auto-generated constructor stub
	}

}
