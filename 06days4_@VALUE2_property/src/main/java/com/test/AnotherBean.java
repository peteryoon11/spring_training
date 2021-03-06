package com.test;

import org.springframework.beans.factory.annotation.Value;

public class AnotherBean {

	@Value("#{ppp.name}")
	private String username;

	@Value("#{ppp.age}")
	private int age;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public AnotherBean() {
		super();
		System.out.println("another bean ");
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "username=" + username + " age=" + age;
	}
	public AnotherBean(String username, int age) {
		this();
		System.out.println(username+"\t"+age+" 인자 있는 생성자");
		//super();
		this.username = username;
		this.age = age;
	}
	
}
