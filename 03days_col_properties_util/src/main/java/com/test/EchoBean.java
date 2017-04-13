package com.test;

import java.util.List;
import java.util.Properties;
import java.util.Set;

public class EchoBean {

	private Properties xxx;

	public Properties getXxx() {
		return xxx;
	}

	public void setXxx(Properties xxx) {
		this.xxx = xxx;
	}

	public EchoBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EchoBean(Properties xxx) {
		super();
		this.xxx = xxx;
	}

	@Override
	public String toString() {
		return "xxx=" + xxx;
	}

}
