package org.han.mapper;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


public interface TimeMapper {

	@Select("select sysdate from dual")
	public String getTime();
	
	@Update("update tbl_bbs set title='¾ß!!!' where bbsno=#{bbsno}")
	   public void update(Integer bbsno);
}
