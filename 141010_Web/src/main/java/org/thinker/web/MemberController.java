package org.thinker.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thinker.vo.MemberVO;


@Controller
@RequestMapping("/member/*")
public class MemberController {

	
	// Return 타입이 없으면 localhost:8080/web/member/doA 호출하면 member.jsp파일 호출
	@RequestMapping("/doA")
	public String doA(){
		// Return 타입을 지정해주면, /WEB-INF/views/bbb/aaa.jsp 파일을 호출한다. 
		return "/bbb/aaa";
	}
	
	// REST 방식 지원
	// localhost:8080/web/member/uid/user03
	@RequestMapping("/doB/{uid}")
	public String doB(@PathVariable("uid") String userId){
		// 자동으로 userId를 수집 
		System.out.println("USERID : "+userId);
		return "/member/bbb";
	}

	@RequestMapping("/create")
	public String doC(MemberVO vo){
		// 자동으로 Member의 모든 정보를 수집
		System.out.println("Member : "+vo);
		return "/member/ccc";
	}
	
	@RequestMapping("/create2")
	// 자동으로 .jsp 파일에 값을 뿌려주는 Annotation
	public String doD(@ModelAttribute("member") MemberVO vo){
		// 자동으로 Member의 모든 정보를 수집
		System.out.println("Member : "+vo);
		return "/member/ddd";
	}
	private static Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping("/doE")
	public void doE(@RequestParam(value="p1", defaultValue="") String p1){
		logger.info("doE....");
		logger.info(p1);
	}
	
}
