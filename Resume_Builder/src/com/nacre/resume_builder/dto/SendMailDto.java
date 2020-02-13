package com.nacre.resume_builder.dto;

import java.io.Serializable;

public class SendMailDto implements Serializable{
	private LoginDto userid;
	private LoginDto username;
	private LoginDto  pwd;
	public LoginDto getUserid() {
		return userid;
	}
	public void setUserid(LoginDto userid) {
		this.userid = userid;
	}
	public LoginDto getUsername() {
		return username;
	}
	public void setUsername(LoginDto username) {
		this.username = username;
	}
	public LoginDto getPwd() {
		return pwd;
	}
	public void setPwd(LoginDto pwd) {
		this.pwd = pwd;
	}
	
	
	
	
}
