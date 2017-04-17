package com.test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

public class EchoBean {

	// private AnotherBean anotherBean;
	@Autowired
	private Map<String,AnotherBean> xxx;

	public Map<String,AnotherBean> getXxx() {
		return xxx;
	}

	public void setXxx(Map<String,AnotherBean> xxx) {
		this.xxx = xxx;
	}

	public EchoBean() {
		super();
		
		System.out.println("echobean 생성자  " + this.xxx);
		// TODO Auto-generated constructor stub
	}

}
