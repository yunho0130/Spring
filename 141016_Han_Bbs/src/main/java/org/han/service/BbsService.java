package org.han.service;

import org.springframework.stereotype.Service;

@Service("bbsService")
public class BbsService {
	
	public BbsVO get(int bbsno){
		BbsVO vo = new BbsVO();
		vo.setBbsno(bbsno);
		vo.setTitle("은애야 정신차려");
		vo.setContent("은애가 약먹을 시간이 지났나보다");
		vo.setWriter("김은애");
		return vo;
	}
	
}
