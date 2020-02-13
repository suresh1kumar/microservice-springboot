package com.nacre.resume_builder.dto;

import java.io.Serializable;
import java.sql.Date;

public class EducationDetailsDto implements Serializable{
	private int edu_id;
	private int userId;
	private String qualificatoin;
	private String schoollName;
	private Date dateAttend;
	private float per;
	private String board;
	private int totaMarks;
	private int obtainMarks;
	private int adrid;
	
	
public int getEdu_id() {
		return edu_id;
	}
	public void setEdu_id(int edu_id) {
		this.edu_id = edu_id;
	}
public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setQualificatoin(String qualificatoin) {
		this.qualificatoin = qualificatoin;
	}
	//	private RegisterUserDto userId;
//	private AddressDetailsDto addrId;
	public String getSchoollName() {
		return schoollName;
	}
	public void setSchoollName(String schoollName) {
		this.schoollName = schoollName;
	}
	public Date getDateAttend() {
		return (Date) dateAttend;
	}
	public void setDateAttend(java.sql.Date date) {
		this.dateAttend = date;
	}
	public String getQualificatoin() {
		return qualificatoin;
	}
	public void setQualificatin(String qualificatoin) {
		this.qualificatoin = qualificatoin;
	}
	public Float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	public String getBoard() {
		return board;
	}
	public void setBoard(String board) {
		this.board = board;
	}
	public int getTotaMarks() {
		return totaMarks;
	}
	public void setTotaMarks(int totaMarks) {
		this.totaMarks = totaMarks;
	}
	public int getObtainMarks() {
		return obtainMarks;
	}
	public void setObtainMarks(int obtainMarks) {
		this.obtainMarks = obtainMarks;
	}
	public int getAdrid() {
		return adrid;
	}
	public void setAdrid(int adrid) {
		this.adrid = adrid;
	}
	
	
	
	
}
