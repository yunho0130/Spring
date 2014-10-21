package org.han.web;

import static org.junit.Assert.fail;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.han.service.BbsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/**/*-context.xml"})
public class BbsServiceTest {
	
	@Inject
	BbsService service;
	
	static Logger logger = Logger.getLogger("Test");

	@Test
	public void test() {
		Assert.notNull(service);
		logger.info(service.get(001));
	}

}
