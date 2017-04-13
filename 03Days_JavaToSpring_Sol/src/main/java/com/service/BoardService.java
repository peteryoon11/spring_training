package com.service;

import java.util.List;

import com.dao.BoardDAO;

public class BoardService {
	private BoardDAO dao;

	public List<String> list() {

		return dao.list();
	}

	public BoardDAO getDao() {
		return dao;
	}

	public void setDao(BoardDAO dao) {
		this.dao = dao;
	}

}
