package com.nacre.resume_builder.dto;

import java.io.Serializable;
import java.sql.Date;

public class ProfessionDetailsDto implements Serializable{
	private int pro_id;
	private int userid;
	private String employerName;
	private Date fromDate;
	private Date toDate;
	private String jobTitle;
	private String duties;
	
	public int getPro_id() {
		return pro_id;
	}
	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public void setFromDate(Date string) {
		this.fromDate = string;
	}
	
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromNate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public String getDuties() {
		return duties;
	}
	public void setDuties(String duties) {
		this.duties = duties;
	}
	
	

}
