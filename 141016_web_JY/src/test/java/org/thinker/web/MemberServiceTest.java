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
// 모든 하위 폴더에 -context.xml로 끝나는 파일을 로딩하며 locations에 2개 이상의 파일을 넣어 줄 수 있다.
public class MemberServiceTest {

	//@Autowired(required=service) 자동으로 타입을 찾아가며 규칙이 있다. 하지만 잘 안씀 	
	//@Resource(name="memberService") 2.x 후반에는 이 방법을 사용한다. 이름을 명시해 줌
	@Inject //3.x 버전 이후에는 이 방법을 많이 쓰는 것 같다고 말씀하심.
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
