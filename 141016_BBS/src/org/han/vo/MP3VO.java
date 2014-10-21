package org.han.vo;

import java.sql.Date;

public class MP3VO {
	
	/*
	 *   mno number,
  title varchar2(1000),
  fileName varchar2(1000),
  descCont varchar2(2000),
  cate VARCHAR2(50),
  userID VARCHAR2(1000),
  rCount number,
  vCount NUMBER,
  regdate
	 */
	
	
	private Integer mno;
	private String title;
	private String fileName;
	private String descCont;
	private String cate;
	private String userID;
	private Integer rCount;
	private Integer vCount;
	private Date regDate;
	private String art;
	private String img;
	private String alb;
	private Integer rn;
	public Integer getMno() {
		return mno;
	}
	public void setMno(Integer mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getDescCont() {
		return descCont;
	}
	public void setDescCont(String descCont) {
		this.descCont = descCont;
	}
	public String getCate() {
		return cate;
	}
	public void setCate(String cate) {
		this.cate = cate;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public Integer getrCount() {
		return rCount;
	}
	public void setrCount(Integer rCount) {
		this.rCount = rCount;
	}
	public Integer getvCount() {
		return vCount;
	}
	public void setvCount(Integer vCount) {
		this.vCount = vCount;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getArt() {
		return art;
	}
	public void setArt(String art) {
		this.art = art;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getAlb() {
		return alb;
	}
	public void setAlb(String alb) {
		this.alb = alb;
	}
	public Integer getRn() {
		return rn;
	}
	public void setRn(Integer rn) {
		this.rn = rn;
	}
	@Override
	public String toString() {
		return "MP3VO [mno=" + mno + ", title=" + title + ", fileName="
				+ fileName + ", descCont=" + descCont + ", cate=" + cate
				+ ", userID=" + userID + ", rCount=" + rCount + ", vCount="
				+ vCount + ", regDate=" + regDate + ", art=" + art + ", img="
				+ img + ", alb=" + alb + ", rn=" + rn + "]";
	}
	

}
