package com.mobitec.Mvoucher.domain;

public class Descriptionin_DetailsBean {
	
	private int IN_ID;
	private String DESCRIPTION;
	public Descriptionin_DetailsBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Descriptionin_DetailsBean(int iN_ID, String dESCRIPTION) {
		super();
		IN_ID = iN_ID;
		DESCRIPTION = dESCRIPTION;
	}
	public int getIN_ID() {
		return IN_ID;
	}
	public void setIN_ID(int iN_ID) {
		IN_ID = iN_ID;
	}
	public String getDESCRIPTION() {
		return DESCRIPTION;
	}
	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}
	

}
