package org.han.web;

public interface Criteria {
//검색에 필요한 요소들
	public int getPage();
	
	public int setPage(int page);
	
	public String getKeyword();
	
	public void setKeyword(String keyword);
	
	public String[] getTypes();
	
	public void setTypes(String[] types);
	
	public int getFirst();
	
	public int getLast();
	
	public boolean hasPrev();
	
	public boolean hasNext();
	
	
}
