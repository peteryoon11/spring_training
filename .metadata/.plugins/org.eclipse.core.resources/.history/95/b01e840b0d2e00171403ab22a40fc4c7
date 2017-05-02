package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.DeptDAO;
import com.entity.DeptDTO;

public class DeptService {
	
	@Autowired
	private DeptDAO dao;

	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}

	public void insert(DeptDTO dto) {
        dao.insert(dto);
	}

   public List<DeptDTO> select(){
		
		return dao.select();
		
	}

}
