package com.test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class EchoBean implements InitializingBean,DisposableBean{
	public void aaa()
	{
		System.out.println("destory aaa");
	}
	public void bbb()
	{
		System.out.println("init bbb");
	}
	public String sayEcho() {

		return "안녕하세요 ";
	}

	public EchoBean() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("echobean 생성자");
		
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet");
	}
	
	@PostConstruct
	public void a()
	{
		System.out.println("@PostConstruct");
	}
	
	@PreDestroy
	public void b()
	{
		System.out.println("@PreDestroy");
		
	}
}
