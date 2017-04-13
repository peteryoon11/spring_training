package com.test;

public class EchoBean {
	
	private String mesg;
	private int age;

	public String sayEcho() {

		return "안녕하세요 ";
	}

	public EchoBean() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("echobean 생성자");

	}

	public EchoBean(String mesg) {
		this.mesg = mesg;

	}

	public EchoBean(String mesg, int age) {
		this.mesg = mesg;
		this.age = age;

	}

	public String getMesg() {
		return mesg;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setMesg(String mesg) {
		this.mesg = mesg;
	}
}
