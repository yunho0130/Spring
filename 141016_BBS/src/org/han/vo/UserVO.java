package org.han.vo;

import java.sql.Date;

public class UserVO {

	/*userID varchar2(1000),
  pw varchar2(1000),
  regDate date default sysdate
  */
	
	private String userID;
	private String pw;
	private Date regDate;
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "UserVO [userID=" + userID + ", pw=" + pw + ", regDate="
				+ regDate + "]";
	}
	
}
