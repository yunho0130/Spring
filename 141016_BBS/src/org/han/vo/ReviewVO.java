package org.han.vo;

import java.sql.Date;

public class ReviewVO {

	/*
	 *   rno number,
  mno number,
  review varchar2(2000),
  userID VARCHAR2(1000),
  regDate date default sysdate
  score
	 */
	
	private Integer rno;
	private Integer mno;
	private String review;
	private String userID;
	private Date regDate;
	private Integer score;
	public Integer getRno() {
		return rno;
	}
	public void setRno(Integer rno) {
		this.rno = rno;
	}
	public Integer getMno() {
		return mno;
	}
	public void setMno(Integer mno) {
		this.mno = mno;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "ReviewVO [rno=" + rno + ", mno=" + mno + ", review=" + review
				+ ", userID=" + userID + ", regDate=" + regDate + ", score="
				+ score + "]";
	}
}
