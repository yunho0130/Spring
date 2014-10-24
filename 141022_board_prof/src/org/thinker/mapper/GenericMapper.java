package org.thinker.mapper;

import java.util.List;

import org.thinker.web.util.Criteria;

public interface GenericMapper<E, K> {
	
	public void create(E vo)throws Exception;
	
	public E read(K key)throws Exception;
	
	public void update(E vo)throws Exception;
	
	public void delete(K key)throws Exception;
	
	public List<E> list(Criteria cri)throws Exception;

}
