package org.han.dao;

import java.util.List;

import org.han.vo.MP3VO;

public interface GenericDAO<E, R> {
	
	public void addMp3 (E vo)throws Exception;
	
	public List<MP3VO> list(R pageNum)throws Exception;

	public MP3VO MP3Info(Integer mno)throws Exception;
	
	public void update(E vo)throws Exception;

	public void delete(R mno)throws Exception;
	

}
