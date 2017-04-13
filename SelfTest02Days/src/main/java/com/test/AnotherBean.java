package com.test;

public class AnotherBean {
	private String username;
	private int age;

	public AnotherBean() {
		super();
		System.out.println("another bean constructor");
		// TODO Auto-generated constructor stub
	}

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

	public AnotherBean(String username, int age) {
		super();
		this.username = username;
		this.age = age;
		System.out.println("another bean constructor "+username+"\t"+age);
		
	}

}
