package org.thinker.member;

public class MemberVO {

	private String userid;
	private String password;
	private String name;
	private String email;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "MemberVO [userid=" + userid + ", password=" + password
				+ ", name=" + name + ", email=" + email + "]";
	}
	
	
}
