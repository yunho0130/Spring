package org.thinker.web;

import static org.junit.Assert.fail;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.thinker.mapper.TimeMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/**/*-context.xml"})
public class TimeMapperTest {

	//org.apache.log4j.Logger
	static Logger logger = Logger.getLogger(TimeMapperTest.class);
	
	@Inject
	TimeMapper mapper;
	
	@Test
	public void test() {
		logger.info(mapper);
		logger.info(mapper.getTime());
	}

}
