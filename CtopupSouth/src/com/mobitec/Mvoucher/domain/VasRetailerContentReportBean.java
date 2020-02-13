package com.mobitec.Mvoucher.domain;

import java.util.Date;

import com.mobitec.Mvoucher.jsonconv.JsonConverter;

public class VasRetailerContentReportBean {
	
	private Date INITIATION_TIMESTAMP;
	private String ZONENAME;
	private String CIRCLENAME;
	private String SSANAME;
	private String USER_ID;
	private int TRANSACTION_ID;
	private String REQUESTER_MOBILE_NUMBER;
	private String BENIFICIARY_MOBILE_NUMBER;
	private double AMOUNT;
	private String COMPANY_NAME;
	private String CONTENT_ID;
	
	
	public VasRetailerContentReportBean() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	public VasRetailerContentReportBean(Date iNITIATION_TIMESTAMP, String zONENAME, String cIRCLENAME, String sSANAME,
			String uSER_ID, int tRANSACTION_ID, String rEQUESTER_MOBILE_NUMBER, String bENIFICIARY_MOBILE_NUMBER,
			double aMOUNT, String cOMPANY_NAME, String cONTENT_ID) {
		super();
		INITIATION_TIMESTAMP = iNITIATION_TIMESTAMP;
		ZONENAME = zONENAME;
		CIRCLENAME = cIRCLENAME;
		SSANAME = sSANAME;
		USER_ID = uSER_ID;
		TRANSACTION_ID = tRANSACTION_ID;
		REQUESTER_MOBILE_NUMBER = rEQUESTER_MOBILE_NUMBER;
		BENIFICIARY_MOBILE_NUMBER = bENIFICIARY_MOBILE_NUMBER;
		AMOUNT = aMOUNT;
		COMPANY_NAME = cOMPANY_NAME;
		CONTENT_ID = cONTENT_ID;
	}
	
	public Date getINITIATION_TIMESTAMP() {
		return INITIATION_TIMESTAMP;
	}

	public void setINITIATION_TIMESTAMP(Date iNITIATION_TIMESTAMP) {
		INITIATION_TIMESTAMP = iNITIATION_TIMESTAMP;
	}

	public String getZONENAME() {
		return ZONENAME;
	}

	public void setZONENAME(String zONENAME) {
		ZONENAME = zONENAME;
	}

	public String getCIRCLENAME() {
		return CIRCLENAME;
	}

	public void setCIRCLENAME(String cIRCLENAME) {
		CIRCLENAME = cIRCLENAME;
	}

	public String getSSANAME() {
		return SSANAME;
	}

	public void setSSANAME(String sSANAME) {
		SSANAME = sSANAME;
	}

	public String getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}

	public int getTRANSACTION_ID() {
		return TRANSACTION_ID;
	}

	public void setTRANSACTION_ID(int tRANSACTION_ID) {
		TRANSACTION_ID = tRANSACTION_ID;
	}

	public String getREQUESTER_MOBILE_NUMBER() {
		return REQUESTER_MOBILE_NUMBER;
	}

	public void setREQUESTER_MOBILE_NUMBER(String rEQUESTER_MOBILE_NUMBER) {
		REQUESTER_MOBILE_NUMBER = rEQUESTER_MOBILE_NUMBER;
	}

	public String getBENIFICIARY_MOBILE_NUMBER() {
		return BENIFICIARY_MOBILE_NUMBER;
	}

	public void setBENIFICIARY_MOBILE_NUMBER(String bENIFICIARY_MOBILE_NUMBER) {
		BENIFICIARY_MOBILE_NUMBER = bENIFICIARY_MOBILE_NUMBER;
	}

	public double getAMOUNT() {
		return AMOUNT;
	}

	public void setAMOUNT(double aMOUNT) {
		AMOUNT = aMOUNT;
	}

	public String getCOMPANY_NAME() {
		return COMPANY_NAME;
	}

	public void setCOMPANY_NAME(String cOMPANY_NAME) {
		COMPANY_NAME = cOMPANY_NAME;
	}

	public String getCONTENT_ID() {
		return CONTENT_ID;
	}

	public void setCONTENT_ID(String cONTENT_ID) {
		CONTENT_ID = cONTENT_ID;
	}

	

	@Override
    public String toString() {
        String json = JsonConverter.INSTANCE.asJsonString(this);
        return json;
    }
	
	
	

}
