package com.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.service.CalcService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:echo.xml")
public class CalcTest {
	@Autowired
	CalcService service;

/*	@Test
	public void test() {
		fail("Not yet implemented");
	}
*/
	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		assertEquals(10, service.add(5, 5));
		
	}
	@Test
	public void testMulti() {
		//fail("Not yet implemented");
		assertEquals(25, service.multi(5, 5));
		
	}


}
