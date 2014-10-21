package org.han.web;

public class PageMaker {

	private int page; //���� ������
	private int cnt; //���� �������� �����ϴµ� �ʿ��� �������� ��
	private int lineCount; //ȭ�鿡�� �����ִ� ������ ��
	private int perPage; //�� ���������� ������ �Խù��� ��
	private int first; //lineCount�� ù ��ȣ
	private int last; //lineCount�� ������ ��ȣ
	
	public static int getNumber(String str){
		try{
			return Integer.parseInt(str);
			//int�� ��ȯ�� ������ String���̸� ��ȯ
		}catch(Exception e){
			return 1;
			//int�� ��ȯ�� �Ұ����ϴٸ� 1�� �ݳ�
			//�̷� ������� �ϸ� ������ �߻��ص� 1�� return�Ǳ⶧���� ���α׷��� ���ƴ� ����
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
	//�����ε�
	
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
	//ex: 12�������� ���� �;��(��ȭ)
	//(  ( (int)(Math.ceil(12/(double)10)) ) * (10 * 5))  +1;
	//12������ / �� ���������� ������ �Խù� 10 = 1.2
	//ceil�� �ø��ϸ� 1.2 -> 2.0�� ��ȯ. ��ȯ���� int�� ��ȯ�Ͽ� 2�� ��
	//2*(�� ���������� ������ �Խù� 10 * ȭ�鿡�� �����ִ� ������ �� 5 = 50)
	//2*50 = 100
	//100 + 1 <- next�� �����ֱ� ���Ͽ� ����� ���� 1�� �����ְ� ��

//	private int page; //���� ������
//	private int cnt; //���� �������� �����ϴµ� �ʿ��� �������� ��
//	private int lineCount; //ȭ�鿡�� �����ִ� ������ ��
//	private int perPage; //�� ���������� ������ �Խù��� ��
//	private int first; //���������� ������ ù��° �Խù�
//	private int last; //���������� ������ ������ �Խù�
	
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






