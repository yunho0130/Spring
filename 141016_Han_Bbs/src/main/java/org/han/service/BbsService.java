package org.han.service;

import org.springframework.stereotype.Service;

@Service("bbsService")
public class BbsService {
	
	public BbsVO get(int bbsno){
		BbsVO vo = new BbsVO();
		vo.setBbsno(bbsno);
		vo.setTitle("���־� ��������");
		vo.setContent("���ְ� ����� �ð��� ����������");
		vo.setWriter("������");
		return vo;
	}
	
}
