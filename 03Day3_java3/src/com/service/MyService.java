package com.service;

import java.util.List;

import com.dao.BoardDAO;
import com.dao.PersonDAO;
import com.dto.Person;

public class MyService {

	public List<String> listBoard(){
		BoardDAO dao = new BoardDAO();
		return dao.list();
	}
	
	public List<Person> listPerson(){
		PersonDAO dao = new PersonDAO();
		return dao.list();
	}
}
