package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.service.CalcService;
import com.service.CalcService2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:echo.xml","classpath:echo2.xml"})
public class CalcServiceTest {

	@Autowired
	CalcService service;
	@Autowired
	CalcService2 service2;
	@Test
	public void testAdd() {
		assertEquals(10, service.add(5, 5));
	}
	@Test
	public void testMultiply() {
		assertEquals(25, service2.multiply(5, 5));
	}
}
