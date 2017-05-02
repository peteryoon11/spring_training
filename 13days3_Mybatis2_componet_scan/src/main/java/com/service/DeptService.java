package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.DeptDAO;
import com.entity.DeptDTO;


@Service
public class DeptService {
@Autowired
	private DeptDAO dao;

	public DeptDAO getDao() {
		return dao;
	}

	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}

	

	public void insert(DeptDTO dto) {
		dao.insert(dto);
		
	}



	public List<DeptDTO> select() {
			return dao.select();
		}

}
