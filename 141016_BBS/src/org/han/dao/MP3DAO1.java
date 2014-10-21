package org.han.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MP3DAO1 {

	private static Logger logger = LoggerFactory.getLogger("MP3DAO");

	public String getTableList()throws Exception{

		final String sql =" select * from ( select /*+INDEX_DESC(tbl_mp3, pk_mp3) */ rownum rn, mno, title, art"+
				" from tbl_mp3 where mno>0 and rownum<= 16 ) where rn >0 ";
		//	final String sql ="select sysdate from dual";
		final StringBuffer buffer = new StringBuffer();

		new SQLExecutor(){
			@Override
			protected void doJob()throws Exception {
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				rs.next();
				for (int i = 1; i < 5; i++) {
					buffer.append(rs.getString(i));	
					buffer.append("|");
				}
				logger.info(buffer.toString());
			}
		}.execute();
		return buffer.toString();
	}
}

