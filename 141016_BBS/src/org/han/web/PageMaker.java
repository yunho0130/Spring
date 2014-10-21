package org.han.web;

public class PageMaker {

	private int page; //현재 페이지
	private int cnt; //현재 페이지를 구성하는데 필요한 데이터의 수
	private int lineCount; //화면에서 보여주는 페이지 수
	private int perPage; //한 페이지에서 보여줄 게시물의 수
	private int first; //lineCount의 첫 번호
	private int last; //lineCount의 마지막 번호
	
	public static int getNumber(String str){
		try{
			return Integer.parseInt(str);
			//int로 변환이 가능한 String값이면 변환
		}catch(Exception e){
			return 1;
			//int로 변환이 불가능하다면 1을 반납
			//이런 방식으로 하면 에러가 발생해도 1이 return되기때문에 프로그램은 돌아는 간다
		}
	}
	
	public PageMaker(){
		this(1);
	}
	
	public PageMaker(int page){
		this(page, 0);
	}
	
	public PageMaker(String pageStr){
		this(getNumber(pageStr),0);
	}
	//overloading
	
	public PageMaker(int page, int cnt) {
		this(page, cnt, 5,16);
	}
	//오버로딩
	
	public PageMaker(int page, int cnt, int lineCount, int perPage) {
		super();
		this.page = page;
		this.cnt = cnt;
		this.lineCount = lineCount;
		this.perPage = perPage;
		this.first = 1;
		this.last = 5;
	}
	// if((perPage*last)+1 == getRowNum())
	

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getLast() {
		return last;
	}

	public void setLast(int last) {
		this.last = last;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public int getLineCount() {
		return lineCount;
	}

	public void setLineCount(int lineCount) {
		this.lineCount = lineCount;
	}

	public int getPerPage() {
		return perPage;
	}

	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}
	
	public int getRowNum(){
		
		return (  ( (int)(Math.ceil(page/(double)perPage)) ) * (perPage * lineCount))  +1;
	 	
	}
	//ex: 12페이지를 보고 싶어요(명화)
	//(  ( (int)(Math.ceil(12/(double)10)) ) * (10 * 5))  +1;
	//12페이지 / 한 페이지에서 보여줄 게시물 10 = 1.2
	//ceil로 올림하면 1.2 -> 2.0로 변환. 변환값을 int로 변환하여 2가 됨
	//2*(한 페이지에서 보여줄 게시물 10 * 화면에서 보여주는 페이지 수 5 = 50)
	//2*50 = 100
	//100 + 1 <- next를 보여주기 위하여 산출된 값에 1을 더해주게 됨

//	private int page; //현재 페이지
//	private int cnt; //현재 페이지를 구성하는데 필요한 데이터의 수
//	private int lineCount; //화면에서 보여주는 페이지 수
//	private int perPage; //한 페이지에서 보여줄 게시물의 수
//	private int first; //페이지에서 보여줄 첫번째 게시물
//	private int last; //페이지에서 보여줄 마지막 게시물
	
	public int getRnFirst(){
		
		return getRnLast() - perPage;
	}
	
	public int getRnLast(){
		
		return (page * perPage);
	}
	

	@Override
	public String toString() {
		return "PageMaker [page=" + page + ", cnt=" + cnt + ", lineCount="
				+ lineCount + ", perPage=" + perPage + "]";
	}
	
//	public static void main(String[] args) {
//
//		PageMaker maker = new PageMaker(12);
//		System.out.println(maker.getRowNum());
//	}
//	
	
	
	
}






