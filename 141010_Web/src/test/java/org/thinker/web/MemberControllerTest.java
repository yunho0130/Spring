package org.thinker.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/main/**/*-context.xml"})

public class MemberControllerTest {

	@Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;
    
	private static Logger logger = LoggerFactory.getLogger("MemberControllerTest");

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

	@Test
	public void test() throws Exception {
		logger.info(this.mockMvc.toString());
		
		// requestBuilder는 인터페이스야. 그래서 static import 구문이 필요해. 
		// MockMvcRequestBuilders.get("")해서 사용할 부분을 아래처럼 축약해서 사용가능
		MvcResult result =
		 mockMvc.perform(
				 get("/member/doE")
				 .param("p1", "AAA"))
		 .andExpect(status().isOk())
		 .andReturn();
		logger.info(result.getModelAndView().getViewName());
	}

}
