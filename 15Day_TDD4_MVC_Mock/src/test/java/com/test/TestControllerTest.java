package com.test;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.controller.TestController;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/test/servlet-context.xml")
@WebAppConfiguration
public class TestControllerTest {

	@Autowired
	WebApplicationContext ctx;
	
	MockMvc mockMVC;
	@Before
	public void setUp() throws Exception {
		mockMVC = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
     
	 // /aaa 요청시 성공시 status:200
	@Test
	public void testXxxx() throws Exception{
		mockMVC.perform(MockMvcRequestBuilders.get("/aaa"))
		.andExpect(MockMvcResultMatchers.status().is(200));
	}
	@Test
	public void testXxxx2() throws Exception{
		mockMVC.perform(MockMvcRequestBuilders.get("/aaa"))
		.andExpect(MockMvcResultMatchers.handler().handlerType(TestController.class));
	}
	// /aaa 요청 성공시  view 가 hello 이면 성공 
	@Test
	public void testXxxx3() throws Exception{
		mockMVC.perform(MockMvcRequestBuilders.get("/aaa"))
		.andExpect(MockMvcResultMatchers.view().name("hello"));
	}
	@Test
	public void testXxxx_bb() throws Exception{
		mockMVC.perform(MockMvcRequestBuilders.get("/bbb"))
		.andExpect(MockMvcResultMatchers.model().attribute("xyz", "홍길동"));
	}
	@Test
	public void testXxxx_cc() throws Exception{
		mockMVC.perform(MockMvcRequestBuilders.get("/ccc"))
		.andExpect(MockMvcResultMatchers.redirectedUrl("aaa/**")
				);
	}


}
