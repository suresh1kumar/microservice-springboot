package com.mobitec.Mvoucher.domain;

import java.io.Serializable;
import java.util.Date;

import com.mobitec.Mvoucher.jsonconv.JsonConverter;

public class MNPCommissionReportsDetailedBean implements Serializable{
	
	private String MSISDN;
	private String DEALER_CODE;
//	private int  CIRCLE;
	//private int SSA;
	private String CIRCLE;
	private String SSA;
	private Date APPROVED_DATE;
	private double AMOUNT;
	private int CASH_RECEIVED;
	private int FACE_VALUE;
	private int SERVICE_TAX;
	private int COMMISSION_AMOUNT;
	private int TDS_CTOPUP;
	private int TDS_SS;
	private Date INSERTION_DATE;
	
	
	public MNPCommissionReportsDetailedBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MNPCommissionReportsDetailedBean(String mSISDN, String dEALER_CODE, String cIRCLE, String sSA, Date aPPROVED_DATE,
			double aMOUNT, int cASH_RECEIVED, int fACE_VALUE, int sERVICE_TAX, int cOMMISSION_AMOUNT, int tDS_CTOPUP,
			int tDS_SS, Date iNSERTION_DATE) {
		super();
		MSISDN = mSISDN;
		DEALER_CODE = dEALER_CODE;
		CIRCLE = cIRCLE;
		SSA = sSA;
		APPROVED_DATE = aPPROVED_DATE;
		AMOUNT = aMOUNT;
		CASH_RECEIVED = cASH_RECEIVED;
		FACE_VALUE = fACE_VALUE;
		SERVICE_TAX = sERVICE_TAX;
		COMMISSION_AMOUNT = cOMMISSION_AMOUNT;
		TDS_CTOPUP = tDS_CTOPUP;
		TDS_SS = tDS_SS;
		INSERTION_DATE = iNSERTION_DATE;
	}
	
	
	public String getMSISDN() {
		return MSISDN;
	}
	public void setMSISDN(String mSISDN) {
		MSISDN = mSISDN;
	}
	public String getDEALER_CODE() {
		return DEALER_CODE;
	}
	public void setDEALER_CODE(String dEALER_CODE) {
		DEALER_CODE = dEALER_CODE;
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
	public Date getAPPROVED_DATE() {
		return APPROVED_DATE;
	}
	public void setAPPROVED_DATE(Date aPPROVED_DATE) {
		APPROVED_DATE = aPPROVED_DATE;
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
	public Date getINSERTION_DATE() {
		return INSERTION_DATE;
	}
	public void setINSERTION_DATE(Date iNSERTION_DATE) {
		INSERTION_DATE = iNSERTION_DATE;
	}
	

	@Override
    public String toString() {
        String json = JsonConverter.INSTANCE.asJsonString(this);
        return json;
    }
	

}
