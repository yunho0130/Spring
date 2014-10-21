package org.thinker.web;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;
import org.thinker.service.MemberService;

import a1.HelloWorld;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/**/*-context.xml"})
//@ContextConfiguration(locations = {"file:src/main/**/*-context.xml"},
//					classes={org.thinker.config.AppConfiguration.class})
// ��� ���� ������ -context.xml�� ������ ������ �ε��ϸ� locations�� 2�� �̻��� ������ �־� �� �� �ִ�.
public class MemberServiceTest {

	//@Autowired(required=service) �ڵ����� Ÿ���� ã�ư��� ��Ģ�� �ִ�. ������ �� �Ⱦ� 	
	//@Resource(name="memberService") 2.x �Ĺݿ��� �� ����� ����Ѵ�. �̸��� ����� ��
	@Inject //3.x ���� ���Ŀ��� �� ����� ���� ���� �� ���ٰ� �����Ͻ�.
	MemberService service;
	
	//@Inject
	HelloWorld hello;
	
	static Logger logger = Logger.getLogger("TEST"); 
	
	@Test
	public void test() {
		Assert.notNull(service);
		logger.info(service.get("dummy"));
	}

	@Test
	public void test2() {
		Assert.notNull(hello);
		logger.info(hello.sayHello());
	}

}
