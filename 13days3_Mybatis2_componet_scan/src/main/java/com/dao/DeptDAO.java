package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.entity.DeptDTO;


@Repository("yyy")
public class DeptDAO {
@Autowired
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
