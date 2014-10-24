package org.thinker.dao;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class GenericDAO<E, K> {
	
	SqlSessionFactory sqlMapper;
	private String mapperName;
	
	public GenericDAO(String mapperName)throws Exception{
		Reader reader = Resources.getResourceAsReader("mybatisConfig.xml");
		sqlMapper = new SqlSessionFactoryBuilder().build(reader);
		this.mapperName = mapperName;
	}
	
	public void insert(E vo)throws Exception{
		
		SqlSession session = sqlMapper.openSession();
		
		session.insert(mapperName+".create", vo);

		session.commit();
		session.close();
		
	}
}
