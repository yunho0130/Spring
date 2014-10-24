package org.thinker.test;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.thinker.bbs.BbsMapper;

public class MybatisTest {
	
	static Logger logger = Logger.getLogger(MybatisTest.class);
	SqlSessionFactory sqlMapper;

	@Before
	public void setUp() throws Exception {
		Reader reader = Resources.getResourceAsReader("mybatisConfig.xml");
		sqlMapper = new SqlSessionFactoryBuilder().build(reader);
	}

	@Test
	public void test() {
	
		logger.info(sqlMapper);
		
		try(SqlSession session = sqlMapper.openSession()){
			
			BbsMapper mapper = session.getMapper(BbsMapper.class);
			
			//BbsVO vo = session.selectOne("org.thinker.bbs.BbsMapper.getVO", 1048577);
			
			//logger.info(vo);
			
			//session.delete("org.thinker.bbs.BbsMapper.remove",1048577);
			
			System.out.println(mapper);
			
			mapper.remove(1048605);
			
			session.commit();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}

















