package com.entity;

public class LoginDTO {
	private String userid;
	private String passwd;
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
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

	@Override
	public String toString() {
		return "userid=" + userid + " passwd=" + passwd + " email=" + email;
	}

	public LoginDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
