package org.thinker.time;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.thinker.dao.GenericDAO;
import org.thinker.vo.BbsVO;

public class TimeTest {

	SqlSessionFactory sqlMapper;
	
	@Before
	public void readyConfig()throws Exception{

		Reader reader = Resources.getResourceAsReader("mybatisConfig.xml");
		sqlMapper = new SqlSessionFactoryBuilder().build(reader);
		   
		
		
	}
	
	@Test
	public void test() {
		SqlSession session = sqlMapper.openSession();
		
		String str = session.selectOne("org.thinker.time.TimeMapper.getTime", null);
		
		System.out.println(str);
		
		session.close();
	}

	@Test
	public void testBbs() {
		SqlSession session = sqlMapper.openSession();
		
		BbsVO vo = session.selectOne("org.thinker.mapper.BbsMapper.read", 322123);
		
		System.out.println(vo);
		
		session.close();
	}
	
	@Test
	public void testInsertBbs()  {
		
		GenericDAO<BbsVO, Integer> dao = null;
		try {
			dao = new GenericDAO<BbsVO, Integer>("org.thinker.mapper.BbsMapper");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BbsVO vo = new BbsVO();
		vo.setTitle("테스트 데이터 넣기");
		vo.setContent("테스트 내용");
		vo.setWriter("user00");
		
		try {
			dao.insert(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
