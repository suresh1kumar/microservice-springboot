package com.nacre.resume_builder.dto;

public class RegisterUserDto {
	
	private String userName;
	private String email;
	private long userMob;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getUserMob() {
		return userMob;
	}
	public void setUserMob(long userMob) {
		this.userMob = userMob;
	}

	
	
}
