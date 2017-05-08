package com.test;

import static org.junit.Assert.*;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/test/servlet-context.xml")
@WebAppConfiguration
public class TestControllerTest {
MockMvc mockMVC;

	@Test
	public void testYyyy() {
	//	fail("Not yet implemented");
	
	//	mockMVC=MockMvcBuilders.webAppContextSetup(ctx).build();
	mockMVC.perform(MockMvcBuilders.get("/aaa");
	}
	@Autowired
	WebApplicationContext ctx;

	@Before
	public void setUp() throws Exception
	{
			mockMVC=MockMvcBuilders.webAppContextSetup(ctx).build();
		
	}
}
