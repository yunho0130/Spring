package org.thinker.common;

import java.util.ArrayList;
import java.util.List;

public class PageMaker {

	private int page;
	private int total;
	//한 페이지에 몇 개의 데이터를 보여주는가? 기본은 10개  
	private int perPageSize = 10;
	//화면에 보여주는 시작 페이지 번호 
	private int startPage; 
	
	//화면에 보여지는 페이지의 수  11,12,13 .... 20 인 경우라면 10 
	private int displaySize = 10; 
	
	//화면에 보여지는 마지막 페이지 번호 
	private int endPage;
	
	private boolean hasBefore = false;
	
	private boolean hasNext = false;
	
	
	
	public int getPage() {
		return page;
	}

	public int getTotal() {
		return total;
	}

	public int getPerPageSize() {
		return perPageSize;
	}

	public int getStartPage() {
		return startPage;
	}

	public int getDisplaySize() {
		return displaySize;
	}

	public int getEndPage() {
		return endPage;
	}

	public boolean isHasBefore() {
		return hasBefore;
	}

	public boolean isHasNext() {
		return hasNext;
	}

	public PageMaker(int page, int total) {
		this.page = page;
		this.total = total;
		calcStartEndPage();
	}
	
	public void calcStartEndPage(){
		
		int tempEnd = ((int)Math.ceil(page/(double)perPageSize)) * displaySize;
		
		this.startPage =  (tempEnd - displaySize) + 1;
		
		//check tempEnd and total end 
		
		if(total >= tempEnd * perPageSize){
			this.endPage = tempEnd;
			
		}else{
			
			this.endPage = (int)Math.floor(total / (double)perPageSize);
		}
		
		if(this.startPage != 1){
			this.hasBefore = true;
		}
		
		if(total > tempEnd * perPageSize ){
			this.hasNext = true;
		}
		
		
	}
	
	public List<String> getPageListStr(String linkStr){
		
		List<String> list = new ArrayList<String>();
		
		for(int i = startPage ; i <= endPage; i++){
			list.add(linkStr.replaceAll("#pno#", ""+i));
		}
		
		return list;
	}
	

	@Override
	public String toString() {
		return "PageMaker [page=" + page + ", total=" + total
				+ ", perPageSize=" + perPageSize + ", startPage=" + startPage
				+ ", displaySize=" + displaySize + ", endPage=" + endPage
				+ ", hasBefore=" + hasBefore + ", hasNext=" + hasNext + "]";
	}

	

	
	
}



