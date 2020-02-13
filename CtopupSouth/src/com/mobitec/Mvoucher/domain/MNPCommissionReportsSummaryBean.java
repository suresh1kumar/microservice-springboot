package com.mobitec.Mvoucher.domain;

import java.io.Serializable;

import com.mobitec.Mvoucher.jsonconv.JsonConverter;

public class MNPCommissionReportsSummaryBean implements Serializable{
	
	//private int  CIRCLE;
	//private int  SSA;
	private String CIRCLE;
	private String SSA;
	private int  FAB_SEQ;
	private String  STATUS;
	private double AMOUNT;
	private int CASH_RECEIVED;
	private int FACE_VALUE;
	private int SERVICE_TAX;
	private int COMMISSION_AMOUNT;
	private int TDS_CTOPUP;
	private int TDS_SS;
	
	public MNPCommissionReportsSummaryBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MNPCommissionReportsSummaryBean(String cIRCLE, String sSA, int fAB_SEQ, String sTATUS, double aMOUNT,
			int cASH_RECEIVED, int fACE_VALUE, int sERVICE_TAX, int cOMMISSION_AMOUNT, int tDS_CTOPUP, int tDS_SS) {
		super();
		CIRCLE = cIRCLE;
		SSA = sSA;
		FAB_SEQ = fAB_SEQ;
		STATUS = sTATUS;
		AMOUNT = aMOUNT;
		CASH_RECEIVED = cASH_RECEIVED;
		FACE_VALUE = fACE_VALUE;
		SERVICE_TAX = sERVICE_TAX;
		COMMISSION_AMOUNT = cOMMISSION_AMOUNT;
		TDS_CTOPUP = tDS_CTOPUP;
		TDS_SS = tDS_SS;
	}

	public String getCIRCLE() {
		return CIRCLE;
	}


	public void setCIRCLE(String cIRCLE) {
		CIRCLE = cIRCLE;
	}


	public String getSSA() {
		return SSA;
	}






	public void setSSA(String sSA) {
		SSA = sSA;
	}






	public int getFAB_SEQ() {
		return FAB_SEQ;
	}






	public void setFAB_SEQ(int fAB_SEQ) {
		FAB_SEQ = fAB_SEQ;
	}






	public String getSTATUS() {
		return STATUS;
	}






	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}






	public double getAMOUNT() {
		return AMOUNT;
	}






	public void setAMOUNT(double aMOUNT) {
		AMOUNT = aMOUNT;
	}






	public int getCASH_RECEIVED() {
		return CASH_RECEIVED;
	}






	public void setCASH_RECEIVED(int cASH_RECEIVED) {
		CASH_RECEIVED = cASH_RECEIVED;
	}






	public int getFACE_VALUE() {
		return FACE_VALUE;
	}






	public void setFACE_VALUE(int fACE_VALUE) {
		FACE_VALUE = fACE_VALUE;
	}






	public int getSERVICE_TAX() {
		return SERVICE_TAX;
	}






	public void setSERVICE_TAX(int sERVICE_TAX) {
		SERVICE_TAX = sERVICE_TAX;
	}






	public int getCOMMISSION_AMOUNT() {
		return COMMISSION_AMOUNT;
	}






	public void setCOMMISSION_AMOUNT(int cOMMISSION_AMOUNT) {
		COMMISSION_AMOUNT = cOMMISSION_AMOUNT;
	}






	public int getTDS_CTOPUP() {
		return TDS_CTOPUP;
	}






	public void setTDS_CTOPUP(int tDS_CTOPUP) {
		TDS_CTOPUP = tDS_CTOPUP;
	}






	public int getTDS_SS() {
		return TDS_SS;
	}






	public void setTDS_SS(int tDS_SS) {
		TDS_SS = tDS_SS;
	}






	@Override
    public String toString() {
        String json = JsonConverter.INSTANCE.asJsonString(this);
        return json;
    }
	
	

	

}
