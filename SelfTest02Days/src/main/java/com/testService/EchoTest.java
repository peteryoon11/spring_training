package com.testService;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.test.EchoBean;

public class EchoTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");
		EchoBean echoBean=ctx.getBean("echobean",EchoBean.class);
		System.out.println(echoBean.getAbean().getUsername()+"\t"+echoBean.getAbean().getAge());
	}
}
