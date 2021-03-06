package com.test;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;


public class EchoBean implements MessageSourceAware {

	MessageSource message;

	public MessageSource getMessageSource() 
	{
		return message;
	}


	public String sayEcho() 
	{

		String mesg = message.getMessage("hello", null, Locale.KOREA);

		System.out.println(mesg + " --");

		return "안녕하세요 " + mesg;

	}

	public EchoBean() 
	{
		super();
		// TODO Auto-generated constructor stub
		System.out.println("echobean 생성자");

	}

	@Override
	public void setMessageSource(MessageSource arg0) 
	{
		// TODO Auto-generated method stub
		this.message = arg0;
	}

}
