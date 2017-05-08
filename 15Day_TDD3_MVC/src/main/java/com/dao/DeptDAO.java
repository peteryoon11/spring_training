package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.entity.DeptDTO;

public class DeptDAO {

	private SqlSessionTemplate template;

	public void setTemplate(SqlSessionTemplate template) {
		this.template = template;
	}
	
	public void insert(DeptDTO dto){
		int n = template.insert("bbb", dto);
	}
	public List<DeptDTO> select(){
		
		return template.selectList("all");
		
	}
	
}




