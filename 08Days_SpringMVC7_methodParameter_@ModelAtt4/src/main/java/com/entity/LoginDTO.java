package com.entity;

import java.util.Arrays;

public class LoginDTO {
	
	private String userid;
	private String passwd;
	private EmailDTO email;
	
	public EmailDTO getEmail() {
		return email;
	}

	public void setEmail(EmailDTO email) {
		this.email = email;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public LoginDTO(String userid, String passwd) {
		super();
		this.userid = userid;
		this.passwd = passwd;
	}

	public LoginDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "userid=" + userid + " passwd=" + passwd + " email=" + email;
	}

}
