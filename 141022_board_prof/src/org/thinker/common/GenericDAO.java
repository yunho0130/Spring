package org.thinker.common;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class GenericDAO<E,K> {
	
	private static SqlSessionFactory sqlMapper;
	
	private String nameSpace;
	
	static{
		try{
			Reader reader = Resources.getResourceAsReader("mybatisConfig.xml");
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	

	public GenericDAO(String nameSpace) {
		super();
		this.nameSpace = nameSpace;
	}

	public void create(E vo)throws Exception{
		
		try(SqlSession session = sqlMapper.openSession(true)){
			
			session.insert(this.nameSpace+".create", vo);
			
		}catch(Exception e){
			throw e;
		}
	}
	
	public E read(K key)throws Exception{
		
		try(SqlSession session = sqlMapper.openSession(true)){
			
			return (E)session.selectOne(this.nameSpace+".read", key);
			
		}catch(Exception e){
			throw e;
		}
	}
	
	public List<E> list(Criteria cri)throws Exception{

		try(SqlSession session = sqlMapper.openSession(true)){
			
			return session.selectList(this.nameSpace+".list", cri);
			
		}catch(Exception e){
			throw e;
		}
		
	}
}
















