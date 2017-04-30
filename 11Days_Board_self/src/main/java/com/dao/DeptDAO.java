package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.entity.DeptDTO;

public class DeptDAO {

	
	public DeptDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	private SqlSessionTemplate template;

	public SqlSessionTemplate getTemplate() {
		return template;
	}

	public void setTemplate(SqlSessionTemplate template) {
		this.template = template;
	}

	public void insert(DeptDTO dto) {
		int n = template.insert("bbb", dto);
	}

	public List<DeptDTO> select() {
		List<DeptDTO> list = template.selectList("all");
		return list;
	}
}
