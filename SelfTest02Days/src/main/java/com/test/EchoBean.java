package com.test;

public class EchoBean {

	private int a;
	private AnotherBean abean;

	public EchoBean() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("echobean constructor");
	}

	public EchoBean(int a, AnotherBean abean) {
		super();
		this.a = a;
		this.abean = abean;
		
		System.out.println(abean.toString()+"\t"+a);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public AnotherBean getAbean() {
		return abean;
	}

	public void setAbean(AnotherBean abean) {
		this.abean = abean;
	}

}