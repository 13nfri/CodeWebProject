package com.nfri13.app.domain;

import java.util.Date;

public class MemberVO {
	private String userid;
	private String userpw;
	private String username;
	private String email;
	private Date regdate;
	private Date updatedate;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	
	@Override
	public String toString() { //테스트용으로 보기쉽게 만든 것.
		return "MemberVO [userid=" + userid + ", userpw=" + userpw
		+ ", username=" + username + ", email=" + email + ", regdate="
		+ regdate + ", updatedate=" + updatedate + ", getUserid()="
		+ getUserid() + ", getUserpw()=" + getUserpw()
		+ ", getUsername()=" + getUsername() + ", getEmail()="
		+ getEmail() + ", getRegdate()=" + getRegdate()
		+ ", getUpdatedate()=" + getUpdatedate() + ", getClass()="
		+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
		+ super.toString() + "]";
	}
}
