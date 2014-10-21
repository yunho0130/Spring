package org.thinker.service;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.thinker.vo.MemberVO;

// 이름은 안줘도 된다.
@Service("memberService")
@Scope()
public class MemberService {

	public MemberVO get(String userId){
		MemberVO vo = new MemberVO();
		vo.setUserId("dummy");
		vo.setPassword("dummy");
		vo.setUsername("더미");
		vo.setEmail("dummy@email.com");
		vo.setPhone("082-023-0230-1111");
		return vo;
	}
}
