package com.test;

public class EchoBean {
	private String mesg;

	public String sayEcho() {

		return "안녕하세요 " + mesg;
	}

	public EchoBean() {

		// TODO Auto-generated constructor stub
		System.out.println("echobean 생성자");

	}

	public EchoBean(String mesg) {
		this.mesg = mesg;
		// TODO Auto-generated constructor stub
		System.out.println("echobean 생성자 + " + mesg);

	}

	public EchoBean(String... strings) {
		this.mesg = mesg;
		// TODO Auto-generated constructor stub
		System.out.println("echobean 생성자 +  +  multi?");
	
		for (String string : strings) {
			System.out.println(string+" 2 ");
		}
	}

	public EchoBean(String bbb, int aaa) {
		this.mesg = mesg;
		// TODO Auto-generated constructor stub
		System.out.println("echobean 생성자 + " + bbb + " "+aaa);

	}
}
