package com.dao;

import java.util.List;

public class BoardDAO {
	private List<String> data;

	public List<String> getData() {
		return data;
	}

	public void setData(List<String> data) {
		this.data = data;
	}

	public BoardDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BoardDAO(List<String> data) {
		super();
		this.data = data;
	}

	@Override
	public String toString() {
		return "data=" + data;
	}

	public List<String> list() {
		return this.data;
	}
}
