package com.service;

import java.util.List;

import com.dao.BoardDAO;

public class BoardService {
	private BoardDAO dao;

	public BoardDAO getDao() {
		return dao;
	}

	public void setDao(BoardDAO dao) {
		this.dao = dao;
	}

	public BoardService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BoardService(BoardDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public String toString() {
		return "dao=" + dao;
	}

	public List<String> list() {
		
		return null;
	}

}
