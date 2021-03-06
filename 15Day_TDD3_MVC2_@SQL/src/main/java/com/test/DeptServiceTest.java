package com.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.service.DeptService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:com/test/servlet-context.xml","classpath:com/test/root-context.xml"})
@WebAppConfiguration
@Sql("classpath:com/test/test.sql")
public class DeptServiceTest {

	@Autowired
	DeptService service;
	
	@Test
	public void testSelect() {
		assertEquals(2, service.select().size());
	}
	

	

}
