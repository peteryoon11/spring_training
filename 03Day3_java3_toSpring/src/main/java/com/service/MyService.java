package com.service;

import java.util.List;

import com.dao.BoardDAO;
import com.dao.PersonDAO;
import com.dto.Person;

public class MyService {
private BoardDAO bdao;
private PersonDAO pdao;

	public List<String> listBoard(){
//		BoardDAO dao = new BoardDAO();
		return bdao.list();
	}
	
	public List<Person> listPerson(){
		//PersonDAO dao = new PersonDAO();
		return pdao.list();
	}

	public BoardDAO getBdao() {
		return bdao;
	}

	public void setBdao(BoardDAO bdao) {
		this.bdao = bdao;
	}

	public PersonDAO getPdao() {
		return pdao;
	}

	public void setPdao(PersonDAO pdao) {
		this.pdao = pdao;
	}
}
