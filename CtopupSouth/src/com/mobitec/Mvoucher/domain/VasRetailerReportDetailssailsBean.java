package com.mobitec.Mvoucher.domain;

import java.util.Date;

import com.mobitec.Mvoucher.jsonconv.JsonConverter;

public class VasRetailerReportDetailssailsBean {
	
	private String ZONENAME;
	private String CIRCLENAME;
	private String SSANAME;
    private Date TRANSDATE;
    private String TRANSACTIONID;
    private String SOURCE_MSISDN;
    private String DMSISDN;
    private int SUBSCRIBER_CIRCLE;
	private int DENOMINATION;
	private int STV_VALUE;
	private int CP_SHARE;
    private String CP_NAME;
    private int STATUS;
    
	public VasRetailerReportDetailssailsBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VasRetailerReportDetailssailsBean(String zONENAME, String cIRCLENAME, String sSANAME, Date tRANSDATE,
			String tRANSACTIONID, String sOURCE_MSISDN, String dMSISDN, int sUBSCRIBER_CIRCLE, int dENOMINATION,
			int sTV_VALUE, int cP_SHARE, String cP_NAME, int sTATUS) {
		super();
		ZONENAME = zONENAME;
		CIRCLENAME = cIRCLENAME;
		SSANAME = sSANAME;
		TRANSDATE = tRANSDATE;
		TRANSACTIONID = tRANSACTIONID;
		SOURCE_MSISDN = sOURCE_MSISDN;
		DMSISDN = dMSISDN;
		SUBSCRIBER_CIRCLE = sUBSCRIBER_CIRCLE;
		DENOMINATION = dENOMINATION;
		STV_VALUE = sTV_VALUE;
		CP_SHARE = cP_SHARE;
		CP_NAME = cP_NAME;
		STATUS = sTATUS;
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
	public Date getTRANSDATE() {
		return TRANSDATE;
	}
	public void setTRANSDATE(Date tRANSDATE) {
		TRANSDATE = tRANSDATE;
	}
	public String getTRANSACTIONID() {
		return TRANSACTIONID;
	}
	public void setTRANSACTIONID(String tRANSACTIONID) {
		TRANSACTIONID = tRANSACTIONID;
	}
	public String getSOURCE_MSISDN() {
		return SOURCE_MSISDN;
	}
	public void setSOURCE_MSISDN(String sOURCE_MSISDN) {
		SOURCE_MSISDN = sOURCE_MSISDN;
	}
	public String getDMSISDN() {
		return DMSISDN;
	}
	public void setDMSISDN(String dMSISDN) {
		DMSISDN = dMSISDN;
	}
	public int getSUBSCRIBER_CIRCLE() {
		return SUBSCRIBER_CIRCLE;
	}
	public void setSUBSCRIBER_CIRCLE(int sUBSCRIBER_CIRCLE) {
		SUBSCRIBER_CIRCLE = sUBSCRIBER_CIRCLE;
	}
	public int getDENOMINATION() {
		return DENOMINATION;
	}
	public void setDENOMINATION(int dENOMINATION) {
		DENOMINATION = dENOMINATION;
	}
	public int getSTV_VALUE() {
		return STV_VALUE;
	}
	public void setSTV_VALUE(int sTV_VALUE) {
		STV_VALUE = sTV_VALUE;
	}
	public int getCP_SHARE() {
		return CP_SHARE;
	}
	public void setCP_SHARE(int cP_SHARE) {
		CP_SHARE = cP_SHARE;
	}
	public String getCP_NAME() {
		return CP_NAME;
	}
	public void setCP_NAME(String cP_NAME) {
		CP_NAME = cP_NAME;
	}
	public int getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(int sTATUS) {
		STATUS = sTATUS;
	}
    
    
	@Override
    public String toString() {
        String json = JsonConverter.INSTANCE.asJsonString(this);
        return json;
    }
	

}
