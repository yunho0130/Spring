package org.thinker.common;

import java.util.ArrayList;
import java.util.List;

public class PageMaker {

	private int page;
	private int total;
	//1페이지에 10개씩
	private int perPageSize = 10;
	//리스트 아래의 페이징 번호 시작
	private int startPage; 
	//리스트 아래의 페이징 번호 몇 개나 보여줄 지
	private int displaySize = 10; 
	//리스트 아래의 페이징 번호 끝
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
	
	// 페이지 번호 매기기 
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


