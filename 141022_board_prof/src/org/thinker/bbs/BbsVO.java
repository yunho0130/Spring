/*
 * BbsVO
 * 게시물 번호, 타이틀, 컨텐츠, 작성자, 작성일, 업데이트일, 조회수, 
 * 리스트데이터 -> 동일 패키지 ListData.java파일 참조
 */
package org.thinker.bbs;

import java.util.Date;

public class BbsVO {

	private Integer bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private Date updatedate;
	private Integer viewcnt;
	
	private ListData listData;
	
	
	public ListData getListData() {
		return listData;
	}
	public void setListData(ListData listData) {
		this.listData = listData;
	}
	public Integer getBno() {
		return bno;
	}
	public void setBno(Integer bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	public Integer getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(Integer viewcnt) {
		this.viewcnt = viewcnt;
	}
	@Override
	public String toString() {
		return "BbsVO [bno=" + bno + ", title=" + title + ", content="
				+ content + ", writer=" + writer + ", regdate=" + regdate
				+ ", updatedate=" + updatedate + ", viewcnt=" + viewcnt
				+ ", listData=" + listData + "]";
	}

	
}
