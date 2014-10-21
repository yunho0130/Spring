package org.han.web;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.han.mapper.TimeMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/**/*-context.xml" })
public class MapperTest {

	static Logger logger = Logger.getLogger(MapperTest.class);

	@Inject
	TimeMapper mapper;

	@Test
	public void testMapper() {
		logger.info(mapper);
		logger.info(mapper.getTime());
	}
	
	@Test
	public void updateTest() {
		logger.info(mapper);
		mapper.update(2);
	}

}
