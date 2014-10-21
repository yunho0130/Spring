package org.thinker.txex.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.thinker.txex.mapper.TxExMapper;

@Service
// Ʈ����� ó�� �ڵ� �߰� 
@Transactional
public class TxExService {

	@Inject
	TxExMapper mapper;
	
	// Ʈ����� ó�� 
//	@Transactional(propagation=Propagation.REQUIRED)
	public void addData(String codeValue, String strValue)throws Exception{
		
		mapper.insertMain(codeValue);
		// sub�� �����ϸ� main���� �ѹ�ȴ�. 
		mapper.insertSub(strValue);
		
	}
	
	public void updateData(Integer num, String value)throws Exception{
		
		
		mapper.insertMain(value);
		
		mapper.update1(num, value);
		
		
	}
	
	
	
}