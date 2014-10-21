package org.thinker.web;

/**
 * JUnit �׽�Ʈ ���� 
 * */


import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;
import org.thinker.service.MemberService;

@RunWith(SpringJUnit4ClassRunner.class)
//��� ������������ -context.xml�� ������ ������ �ε�. 
//locations�� 2�� �̻��� ������ �־��� ���� �ִ�. 
@ContextConfiguration(locations = {"file:src/main/**/*-context.xml"})
public class MemberServiceTest {

	
	//@Autowired(required=service) �ڵ����� Ÿ���� ã�ư���. ��Ģ�� �ִ�. ������ �� �Ⱦ��δ�.
	//@Resource(name="memberService") 2.x �Ĺݿ��� �� ����� ����Ѵ�. �̸��� ������ش�. 
	//@Inject 3.x ���� ���Ŀ��� �� ����� ���� ���� ��. 
	@Inject
	MemberService service;
	
	static Logger logger = Logger.getLogger("TEST");
	
	@Test
	public void test() {
		Assert.notNull(service);
		logger.info(service.get("dummy"));
	}

}
