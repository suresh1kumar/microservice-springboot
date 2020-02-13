package com.nacre.resume_builder.dto;

import java.sql.Date;

public class PersonalDetailsDto {
	private int p_id;
	private int userId;
	private String fname;
	private String lname;
	private String fathname;
	private String mothname;
	private Date dob;
	private String countryname;
	private String statename;
	private String cityname;
	private String gender;
	private int pincode;
	private String addr;
	
	
	
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFathname() {
		return fathname;
	}
	public void setFathname(String fathname) {
		this.fathname = fathname;
	}
	public String getMothname() {
		return mothname;
	}
	public void setMothname(String mothname) {
		this.mothname = mothname;
	}
	public java.sql.Date getDob() {
		return dob;
	}
	public void setDob(java.sql.Date dob) {
		this.dob = dob;
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
		
	
}
