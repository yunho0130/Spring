package org.thinker.web;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.thinker.service.SampleService;
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/main/**/*-context.xml"})
public class SampleLoggerTest {

	@Inject
	SampleService service;

	@Test
	public void test() {
		service.doA();
		service.doB();
	}

}
