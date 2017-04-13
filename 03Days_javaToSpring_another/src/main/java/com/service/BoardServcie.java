package com.service;

import java.util.List;

import com.dao.BoardDAO;

public class BoardServcie {
	private BoardDAO dao;
	
	public BoardDAO getDao() {
		return dao;
	}

	public void setDao(BoardDAO dao) {
		this.dao = dao;
	}

	public List<String> list() {
		return this.dao.list();
	}
}
