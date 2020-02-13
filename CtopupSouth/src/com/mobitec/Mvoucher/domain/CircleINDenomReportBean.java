package com.mobitec.Mvoucher.domain;

import java.util.Date;

import com.mobitec.Mvoucher.jsonconv.JsonConverter;

public class CircleINDenomReportBean {

	/*TIMESTAMP              DATE   
	DENOMINATION           NUMBER 
	CIRCLEID               NUMBER 
	IN_ID                  NUMBER 
	TRANSACTION_TYPE       NUMBER 
	TOTAL_TRANS            NUMBER 
	SUM_DENOM              NUMBER*/
	private Date TIMESTAMP;
	private int DENOMINATION;
	private int CIRCLEID;
	private int IN_ID;
	private int TRANSACTION_TYPE;
	private int TOTAL_TRANS;
	private int SUM_DENOM;
	public CircleINDenomReportBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CircleINDenomReportBean(Date tIMESTAMP, int dENOMINATION, int cIRCLEID, int iN_ID,
			int tRANSACTION_TYPE, int tOTAL_TRANS, int sUM_DENOM) {
		super();
		TIMESTAMP = tIMESTAMP;
		DENOMINATION = dENOMINATION;
		CIRCLEID = cIRCLEID;
		IN_ID = iN_ID;
		TRANSACTION_TYPE = tRANSACTION_TYPE;
		TOTAL_TRANS = tOTAL_TRANS;
		SUM_DENOM = sUM_DENOM;
	}
	public Date getTIMESTAMP() {
		return TIMESTAMP;
	}
	public void setTIMESTAMP(Date tIMESTAMP) {
		TIMESTAMP = tIMESTAMP;
	}
	public int getDENOMINATION() {
		return DENOMINATION;
	}
	public void setDENOMINATION(int dENOMINATION) {
		DENOMINATION = dENOMINATION;
	}
	public int getCIRCLEID() {
		return CIRCLEID;
	}
	public void setCIRCLEID(int cIRCLEID) {
		CIRCLEID = cIRCLEID;
	}
	public double getIN_ID() {
		return IN_ID;
	}
	public void setIN_ID(int iN_ID) {
		IN_ID = iN_ID;
	}
	public double getTRANSACTION_TYPE() {
		return TRANSACTION_TYPE;
	}
	public void setTRANSACTION_TYPE(int tRANSACTION_TYPE) {
		TRANSACTION_TYPE = tRANSACTION_TYPE;
	}
	public int getTOTAL_TRANS() {
		return TOTAL_TRANS;
	}
	public void setTOTAL_TRANS(int tOTAL_TRANS) {
		TOTAL_TRANS = tOTAL_TRANS;
	}
	public int getSUM_DENOM() {
		return SUM_DENOM;
	}
	public void setSUM_DENOM(int sUM_DENOM) {
		SUM_DENOM = sUM_DENOM;
	}
	
	@Override
    public String toString() {
        String json = JsonConverter.INSTANCE.asJsonString(this);
        return json;
    }
}
