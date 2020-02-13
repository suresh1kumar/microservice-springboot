package com.mobitec.Mvoucher.domain;

import java.util.Date;

import com.mobitec.Mvoucher.jsonconv.JsonConverter;

public class VasRetailerReportBean {
	
	private String ZONENAME;
	private String CIRCLENAME;
	private String SSANAME;
	private int DENOMINATION;
	private int STV_VALUE;
	private int CP_SHARE;
	private int NOOFTransactions;
	private int TOTAL_STV_VALUE;
	private int TOTAL_CPSHARE;
	private String CP_NAME;
	private int STATUS;
	
	private int DEALER_ID;
	private String FIRST_NAME;
	
	/*private Date TRANSDATE;
	private String TRANSACTIONID;
	private String SOURCE_MSISDN;
	private String DMSISDN;
	private int SUBSCRIBER_CIRCLE;*/
	
	public VasRetailerReportBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public VasRetailerReportBean(String zONENAME, String cIRCLENAME, String sSANAME, int dENOMINATION, int sTV_VALUE,
			int cP_SHARE, int nOOFTransactions, int tOTAL_STV_VALUE, int tOTAL_CPSHARE, String cP_NAME, int sTATUS) {
		super();
		ZONENAME = zONENAME;
		CIRCLENAME = cIRCLENAME;
		SSANAME = sSANAME;
		DENOMINATION = dENOMINATION;
		STV_VALUE = sTV_VALUE;
		CP_SHARE = cP_SHARE;
		NOOFTransactions = nOOFTransactions;
		TOTAL_STV_VALUE = tOTAL_STV_VALUE;
		TOTAL_CPSHARE = tOTAL_CPSHARE;
		CP_NAME = cP_NAME;
		STATUS = sTATUS;
	}
	
	public VasRetailerReportBean(String zONENAME, String cIRCLENAME, String sSANAME, int dENOMINATION, int sTV_VALUE,
			int cP_SHARE, int nOOFTransactions, int tOTAL_STV_VALUE, int tOTAL_CPSHARE, String cP_NAME, int sTATUS,
			int dEALER_ID, String fIRST_NAME) {
		super();
		ZONENAME = zONENAME;
		CIRCLENAME = cIRCLENAME;
		SSANAME = sSANAME;
		DENOMINATION = dENOMINATION;
		STV_VALUE = sTV_VALUE;
		CP_SHARE = cP_SHARE;
		NOOFTransactions = nOOFTransactions;
		TOTAL_STV_VALUE = tOTAL_STV_VALUE;
		TOTAL_CPSHARE = tOTAL_CPSHARE;
		CP_NAME = cP_NAME;
		STATUS = sTATUS;
		DEALER_ID = dEALER_ID;
		FIRST_NAME = fIRST_NAME;
	}
	
	/*
	public VasRetailerReportBean(String zONENAME, String cIRCLENAME, String sSANAME, int dENOMINATION, int sTV_VALUE,
			int cP_SHARE, String cP_NAME, int sTATUS, Date tRANSDATE, String tRANSACTIONID, String sOURCE_MSISDN,
			String dMSISDN, int sUBSCRIBER_CIRCLE) {
		super();
		ZONENAME = zONENAME;
		CIRCLENAME = cIRCLENAME;
		SSANAME = sSANAME;
		DENOMINATION = dENOMINATION;
		STV_VALUE = sTV_VALUE;
		CP_SHARE = cP_SHARE;
		CP_NAME = cP_NAME;
		STATUS = sTATUS;
		TRANSDATE = tRANSDATE;
		TRANSACTIONID = tRANSACTIONID;
		SOURCE_MSISDN = sOURCE_MSISDN;
		DMSISDN = dMSISDN;
		SUBSCRIBER_CIRCLE = sUBSCRIBER_CIRCLE;
	}
*/
	/*public Date getTRANSDATE() {
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
*/
	

	public int getDEALER_ID() {
		return DEALER_ID;
	}

	public void setDEALER_ID(int dEALER_ID) {
		DEALER_ID = dEALER_ID;
	}

	public String getFIRST_NAME() {
		return FIRST_NAME;
	}

	public void setFIRST_NAME(String fIRST_NAME) {
		FIRST_NAME = fIRST_NAME;
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


	public int getNOOFTransactions() {
		return NOOFTransactions;
	}


	public void setNOOFTransactions(int nOOFTransactions) {
		NOOFTransactions = nOOFTransactions;
	}


	public int getTOTAL_STV_VALUE() {
		return TOTAL_STV_VALUE;
	}


	public void setTOTAL_STV_VALUE(int tOTAL_STV_VALUE) {
		TOTAL_STV_VALUE = tOTAL_STV_VALUE;
	}


	public int getTOTAL_CPSHARE() {
		return TOTAL_CPSHARE;
	}


	public void setTOTAL_CPSHARE(int tOTAL_CPSHARE) {
		TOTAL_CPSHARE = tOTAL_CPSHARE;
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
/*ZONENAME,CIRCLENAME,SSANAME,DENOMINATION,STV_VALUE,CP_SHARE,
NOOFTransactions,TOTAL_STV_VALUE,TOTAL_CPSHARE,CP_NAME,STATUS*/