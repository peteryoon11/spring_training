package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.entity.DeptDTO;
import com.service.DeptService;

/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:com/test/servlet-context.xml","classpath:com/test/root-context.xml"})
@WebAppConfiguration
@Sql("classpath:com/test/test.sql")*/


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:com/test/servlet-context.xml",
	"classpath:com/test/root-context.xml"})
@WebAppConfiguration
//@Sql("classpath:com/test/test.sql")
//@Rollback
//@Transactional
public class DeptServiceTest {
	@Autowired
	DeptService service;

	@Test
	public void testSelect() {
		// fail("Not yet implemented");
	//	DeptDTO dto = new DeptDTO(6, "개발", "서울");
//		assertEquals(1, service.insert(dto));
	//	assertEquals(1, 1);

	}

}
