package com.test;

public class EchoBean {
	private String driver;
	private String url;
	private String userid;
	private String passwd;

	public EchoBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EchoBean(String driver, String url, String userid, String passwd) {
		super();
		this.driver = driver;
		this.url = url;
		this.userid = userid;
		this.passwd = passwd;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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

}
