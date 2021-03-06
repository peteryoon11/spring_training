package com.dao;

import java.util.List;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.DeptDTO;
@Repository("deptDAO")
public class DeptDAO {
@Autowired
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




