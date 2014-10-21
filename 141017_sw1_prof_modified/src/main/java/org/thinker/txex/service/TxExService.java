package org.thinker.txex.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.thinker.txex.mapper.TxExMapper;

@Service
// 트랜잭션 처리 코드 추가 
@Transactional
public class TxExService {

	@Inject
	TxExMapper mapper;
	
	// 트랜잭션 처리 
//	@Transactional(propagation=Propagation.REQUIRED)
	public void addData(String codeValue, String strValue)throws Exception{
		
		mapper.insertMain(codeValue);
		// sub가 실패하면 main까지 롤백된다. 
		mapper.insertSub(strValue);
		
	}
	
	public void updateData(Integer num, String value)throws Exception{
		
		
		mapper.insertMain(value);
		
		mapper.update1(num, value);
		
		
	}
	
	
	
}
