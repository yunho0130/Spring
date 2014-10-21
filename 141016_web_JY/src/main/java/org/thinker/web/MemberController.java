package org.thinker.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thinker.vo.MemberVO;

@Controller
@RequestMapping("/member/*") //member 모듈명
public class MemberController {
	
	//interface
	private static Logger logger =
			LoggerFactory.getLogger(MemberController.class);
	
	//10.14(화)
	@RequestMapping("/create")
	public @ResponseBody String doA(@ModelAttribute("member") MemberVO vo) {
		
		System.out.println("Memver : " + vo);
		
		return "<h1>helloWorld</h1>";
	}
	
	
//	@RequestMapping("/doA")
//	public void doA(){
//		logger.info("doA...............");
//	}

	//get 방식
	@RequestMapping("/doA")
	public void doA(@RequestParam(value="p1") String p1){
		logger.info("doA...............");
		logger.info(p1);
		//defaultValue 지운상태...
	}
	
	
//	//모듈명을 경로로 주도록 한다.
//	//http://localhost:8080/web/member/doA
//	@RequestMapping("/doA")
//	public String doA(){
//		
//		return "member/aaa";
//	}
//	
//	
//	//REST 방식
//	//http://localhost:8080/web/member/uid/user03
//	@RequestMapping("/uid/{uid}")
//	public String doA(@PathVariable("uid") String userId){
//		
//		System.out.println("USERID : " + userId);
//		
//		return "member/aaa";
//	}

	//http://localhost:8080/web/member/create?userId=kkk
//	@RequestMapping("/create")
//	public String doA(MemberVO vo){
//		
//		System.out.println("MEMBER : " + vo);
//		
//		return "member/aaa";
//	}

//	@RequestMapping("/create")
//	public String doA(@ModelAttribute("member") MemberVO vo){
//		
//		System.out.println("MEMBER : " + vo);
//		
//		return "member/aaa";
//	}
	
	
}
