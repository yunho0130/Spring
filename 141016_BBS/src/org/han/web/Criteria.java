package org.han.web;

public interface Criteria {
//�˻��� �ʿ��� ��ҵ�
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
