package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.entity.DeptDTO;

public class DeptDAO {

	private SqlSessionTemplate template;

	public void setTemplate(SqlSessionTemplate template) {
		this.template = template;
	}
	
	public int insert(DeptDTO dto){
		int n = template.insert("bbb", dto);
		return n;
	}
	public List<DeptDTO> select(){
		
		return template.selectList("all");
		
	}
	
}




