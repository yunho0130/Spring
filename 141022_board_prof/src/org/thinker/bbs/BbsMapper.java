/*
 * SQL문을 어노테이션 활용하여 할당.
 * #{title}의 의미는?
 * 왜 interface인가
 */
package org.thinker.bbs;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface BbsMapper {
	@Insert("insert into tbl_bbs00(BNO,TITLE,CONTENT,WRITER) "+ 
	"values ( seq_bbs00.nextval , #{title} , #{content} , #{writer})")
	public void create(BbsVO vo)throws Exception;

	@Select("select sysdate from dual")
	public String getTime();
	
	@Select("select * from tbl_bbs00 where bno = #{bno}")
	public BbsVO read(int bno);
	
	public void remove(int bno);
}