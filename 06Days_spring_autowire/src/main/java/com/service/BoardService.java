package com.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.BoardDAO;

public class BoardService {

	@Autowired
	private BoardDAO dao;

	public List<String> list() {

		return dao.list();
	}



}
