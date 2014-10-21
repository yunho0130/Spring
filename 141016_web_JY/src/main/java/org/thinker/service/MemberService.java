package org.thinker.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.thinker.vo.MemberVO;

@Service("memberService")
@Scope()
public class MemberService {
	
	public MemberVO get(String userId){
		
		MemberVO vo = new MemberVO();
		vo.setUserId("dummy");
		vo.setPassword("dummy");
		vo.setUsername("´õ¹Ì");
		vo.setPhone("010-123-4567");
		vo.setEmail("dummy@dummy.com");
		
		return vo;
	}
}
