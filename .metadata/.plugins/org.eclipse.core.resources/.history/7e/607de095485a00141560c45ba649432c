package org.thinker.common;

import java.util.Arrays;
import java.util.Map;

public class Criteria {

	private int page = 1;
	
	private String[] types;
	
	private String keyword;
	
	private Map<String, String> colMap;
	
	private int total;
	private PageMaker pageMaker;
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
		pageMaker = new PageMaker(this.page, total);
		
	}
	
	public String checked(String type){
		
		if(types == null || types.length == 0){
			return "";
		}
		for(int i = 0; i < types.length; i++){
			
			if(types[i].equals(type)){
				return "checked";
			}
			
		}
		return "";
		
	}

	public String getSql(){
		
		if(types == null || types.length == 0){
			return "";
		}
		
		int idx = 0; 
		StringBuffer query = new StringBuffer("and ( ");
		for (String type : types) {
			idx++;
			query.append(colMap.get(type) +" =  #{keyword}");
			if(idx != types.length){
				query.append(" OR ");
			}
		}
		query.append(" ) ");
		return query.toString();
	}

	public Map<String, String> getColMap() {
		return colMap;
	}

	public void setColMap(Map<String, String> colMap) {
		this.colMap = colMap;
	}

	public String[] getTypes() {
		return types;
	}

	public void setTypes(String[] types) {
		this.types = types;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}
	

	public PageMaker getPageMaker() {
		return pageMaker;
	}

	@Override
	public String toString() {
		return "Criteria [page=" + page + ", types=" + Arrays.toString(types)
				+ ", keyword=" + keyword + "]";
	}
	
	
	
}
