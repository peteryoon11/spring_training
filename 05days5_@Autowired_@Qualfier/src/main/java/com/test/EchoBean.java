package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class EchoBean {

	// @Autowired
	@Autowired
	@Qualifier("x")
	
	private AnotherBean another;

	// @Autowired(required=false)
	/*
	public EchoBean() {
		super();
		System.out.println("echobean 생성자  " + this.another);
		// TODO Auto-generated constructor stub
	}*/

	// @Autowired
/*	public EchoBean(AnotherBean another2) {
		super();
		System.out.println("echobean 생성자  ");
		this.another = another2;
		// TODO Auto-generated constructor stub
	}
*/
	public AnotherBean getAnotherBean() {
		return another;
	}

	// @Qualifier("z")
	// @Qualifier(value="x")

	/*
	 * public void setAnotherBean(@Qualifier("z") AnotherBean another3) {
	 * this.another = another3; }
	 */
/*	public void setAnotherBean(AnotherBean another3) {
		this.another = another3;
	}
*/
}
