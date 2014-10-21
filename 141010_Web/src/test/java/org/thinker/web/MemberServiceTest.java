package org.thinker.web;

/**
 * JUnit 테스트 파일 
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
//모든 하위폴더에서 -context.xml로 끝나는 파일을 로딩. 
//locations에 2개 이상의 파일을 넣어줄 수도 있다. 
@ContextConfiguration(locations = {"file:src/main/**/*-context.xml"})
public class MemberServiceTest {

	
	//@Autowired(required=service) 자동으로 타입을 찾아간다. 규칙이 있다. 요즘은 잘 안쓰인다.
	//@Resource(name="memberService") 2.x 후반에는 이 방법을 사용한다. 이름을 명시해준다. 
	//@Inject 3.x 버전 이후에는 이 방법을 많이 쓰는 듯. 
	@Inject
	MemberService service;
	
	static Logger logger = Logger.getLogger("TEST");
	
	@Test
	public void test() {
		Assert.notNull(service);
		logger.info(service.get("dummy"));
	}

}
