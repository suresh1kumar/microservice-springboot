package com.mobitec.Mvoucher.domain;

import java.util.Date;

import com.mobitec.Mvoucher.jsonconv.JsonConverter;

public class MNPCommissionReportsErrorBean {
	
	/*Seq Id;Dealer Id;Dealer Mobile,Amount,Description,Circle,City,Insertion Date,
	Status,Service Tax,Face Value,Commission Amount,Cash Received,Approved Dateprivate int*/
	
	private int FAB_SEQ;
	private int Dealer_Id;
	private String MSISDN;
	private double AMOUNT;
	private String DESCRIPTION;
	private String CIRCLE;
	private String SSA;
	private Date INSERTION_DATE;
	private String STATUS;
	private int SERVICE_TAX;
	private int FACE_VALUE;
	private int COMMISSION_AMOUNT;
	private int CASH_RECEIVED;
	private Date APPROVED_DATE;
	
	public MNPCommissionReportsErrorBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MNPCommissionReportsErrorBean(int fAB_SEQ, int dealer_Id, String mSISDN, double aMOUNT, String dESCRIPTION,
			String cIRCLE, String sSA, Date iNSERTION_DATE, String sTATUS, int sERVICE_TAX, int fACE_VALUE,
			int cOMMISSION_AMOUNT, int cASH_RECEIVED, Date aPPROVED_DATE) {
		super();
		FAB_SEQ = fAB_SEQ;
		Dealer_Id = dealer_Id;
		MSISDN = mSISDN;
		AMOUNT = aMOUNT;
		DESCRIPTION = dESCRIPTION;
		CIRCLE = cIRCLE;
		SSA = sSA;
		INSERTION_DATE = iNSERTION_DATE;
		STATUS = sTATUS;
		SERVICE_TAX = sERVICE_TAX;
		FACE_VALUE = fACE_VALUE;
		COMMISSION_AMOUNT = cOMMISSION_AMOUNT;
		CASH_RECEIVED = cASH_RECEIVED;
		APPROVED_DATE = aPPROVED_DATE;
	}
	public int getFAB_SEQ() {
		return FAB_SEQ;
	}
	public void setFAB_SEQ(int fAB_SEQ) {
		FAB_SEQ = fAB_SEQ;
	}
	public int getDealer_Id() {
		return Dealer_Id;
	}
	public void setDealer_Id(int dealer_Id) {
		Dealer_Id = dealer_Id;
	}
	public String getMSISDN() {
		return MSISDN;
	}
	public void setMSISDN(String mSISDN) {
		MSISDN = mSISDN;
	}
	public double getAMOUNT() {
		return AMOUNT;
	}
	public void setAMOUNT(double aMOUNT) {
		AMOUNT = aMOUNT;
	}
	public String getDESCRIPTION() {
		return DESCRIPTION;
	}
	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
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
	public Date getINSERTION_DATE() {
		return INSERTION_DATE;
	}
	public void setINSERTION_DATE(Date iNSERTION_DATE) {
		INSERTION_DATE = iNSERTION_DATE;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public int getSERVICE_TAX() {
		return SERVICE_TAX;
	}
	public void setSERVICE_TAX(int sERVICE_TAX) {
		SERVICE_TAX = sERVICE_TAX;
	}
	public int getFACE_VALUE() {
		return FACE_VALUE;
	}
	public void setFACE_VALUE(int fACE_VALUE) {
		FACE_VALUE = fACE_VALUE;
	}
	public int getCOMMISSION_AMOUNT() {
		return COMMISSION_AMOUNT;
	}
	public void setCOMMISSION_AMOUNT(int cOMMISSION_AMOUNT) {
		COMMISSION_AMOUNT = cOMMISSION_AMOUNT;
	}
	public int getCASH_RECEIVED() {
		return CASH_RECEIVED;
	}
	public void setCASH_RECEIVED(int cASH_RECEIVED) {
		CASH_RECEIVED = cASH_RECEIVED;
	}
	public Date getAPPROVED_DATE() {
		return APPROVED_DATE;
	}
	public void setAPPROVED_DATE(Date aPPROVED_DATE) {
		APPROVED_DATE = aPPROVED_DATE;
	}
	
	@Override
    public String toString() {
        String json = JsonConverter.INSTANCE.asJsonString(this);
        return json;
    }

}
