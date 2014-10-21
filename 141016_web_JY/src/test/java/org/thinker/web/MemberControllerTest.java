package org.thinker.web;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    private static Logger logger = LoggerFactory.getLogger("MemberControllerTest");
    
	@Test
	public void test() throws Exception {
		logger.info(this.mockMvc.toString());
		
//		MvcResult result = mockMvc.perform(get("/member/doA"))
//		.andExpect(status().isOk())
//		.andReturn();

		//get
		MvcResult result = mockMvc.perform(
				get("/member/doA")
				.param("p2", "AAA"))
				.andExpect(status().isOk())
				.andReturn();
		
		logger.info(result.getModelAndView().getViewName());
	}

}
