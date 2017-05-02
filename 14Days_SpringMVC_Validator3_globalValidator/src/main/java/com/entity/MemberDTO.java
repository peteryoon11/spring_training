package com.entity;

public class MemberDTO {
	private String address;
	private String email;
	@Override
	public String toString() {
		return "address=" + address + " email=" + email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public MemberDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberDTO(String address, String email) {
		super();
		this.address = address;
		this.email = email;
	}

}
