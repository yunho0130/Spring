package org.han.service;

import java.sql.Date;

public class BbsVO {
	private Integer bbsno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private Integer viewcnt;
	public Integer getBbsno() {
		return bbsno;
	}
	public void setBbsno(Integer bbsno) {
		this.bbsno = bbsno;
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
	public Integer getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(Integer viewcnt) {
		this.viewcnt = viewcnt;
	}
	@Override
	public String toString() {
		return "BbsVO [bbsno=" + bbsno + ", title=" + title + ", content="
				+ content + ", writer=" + writer + ", regdate=" + regdate
				+ ", viewcnt=" + viewcnt + "]";
	}
	
}
