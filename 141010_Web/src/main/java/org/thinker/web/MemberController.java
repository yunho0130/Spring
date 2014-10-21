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

	
	// Return Ÿ���� ������ localhost:8080/web/member/doA ȣ���ϸ� member.jsp���� ȣ��
	@RequestMapping("/doA")
	public String doA(){
		// Return Ÿ���� �������ָ�, /WEB-INF/views/bbb/aaa.jsp ������ ȣ���Ѵ�. 
		return "/bbb/aaa";
	}
	
	// REST ��� ����
	// localhost:8080/web/member/uid/user03
	@RequestMapping("/doB/{uid}")
	public String doB(@PathVariable("uid") String userId){
		// �ڵ����� userId�� ���� 
		System.out.println("USERID : "+userId);
		return "/member/bbb";
	}

	@RequestMapping("/create")
	public String doC(MemberVO vo){
		// �ڵ����� Member�� ��� ������ ����
		System.out.println("Member : "+vo);
		return "/member/ccc";
	}
	
	@RequestMapping("/create2")
	// �ڵ����� .jsp ���Ͽ� ���� �ѷ��ִ� Annotation
	public String doD(@ModelAttribute("member") MemberVO vo){
		// �ڵ����� Member�� ��� ������ ����
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
