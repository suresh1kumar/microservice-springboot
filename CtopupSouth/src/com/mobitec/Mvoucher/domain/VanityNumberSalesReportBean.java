package com.mobitec.Mvoucher.domain;

import java.util.Date;

import com.mobitec.Mvoucher.jsonconv.JsonConverter;

public class VanityNumberSalesReportBean {
	private String SANCHAR_ID;
	private int DEALER_ID;
	private Date TRANS_DATE;
	private String SOURCE_MSISDN;
	private String DEST_MSISDN;
	private double AMOUNT;
	private double SOURCE_BALANCE_BEFORE;
	private double SOURCE_BALANCE_AFTER;
	private int DEST_CIRCLE_ID;
	private int SOURCE_CIRCLE_ID;
	public VanityNumberSalesReportBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VanityNumberSalesReportBean(String sANCHAR_ID, int dEALER_ID, Date tRANS_DATE, String sOURCE_MSISDN,
			String dEST_MSISDN, double aMOUNT, double sOURCE_BALANCE_BEFORE, double sOURCE_BALANCE_AFTER,
			int dEST_CIRCLE_ID, int sOURCE_CIRCLE_ID) {
		super();
		SANCHAR_ID = sANCHAR_ID;
		DEALER_ID = dEALER_ID;
		TRANS_DATE = tRANS_DATE;
		SOURCE_MSISDN = sOURCE_MSISDN;
		DEST_MSISDN = dEST_MSISDN;
		AMOUNT = aMOUNT;
		SOURCE_BALANCE_BEFORE = sOURCE_BALANCE_BEFORE;
		SOURCE_BALANCE_AFTER = sOURCE_BALANCE_AFTER;
		DEST_CIRCLE_ID = dEST_CIRCLE_ID;
		SOURCE_CIRCLE_ID = sOURCE_CIRCLE_ID;
	}
	public String getSANCHAR_ID() {
		return SANCHAR_ID;
	}
	public void setSANCHAR_ID(String sANCHAR_ID) {
		SANCHAR_ID = sANCHAR_ID;
	}
	public int getDEALER_ID() {
		return DEALER_ID;
	}
	public void setDEALER_ID(int dEALER_ID) {
		DEALER_ID = dEALER_ID;
	}
	public Date getTRANS_DATE() {
		return TRANS_DATE;
	}
	public void setTRANS_DATE(Date tRANS_DATE) {
		TRANS_DATE = tRANS_DATE;
	}
	public String getSOURCE_MSISDN() {
		return SOURCE_MSISDN;
	}
	public void setSOURCE_MSISDN(String sOURCE_MSISDN) {
		SOURCE_MSISDN = sOURCE_MSISDN;
	}
	public String getDEST_MSISDN() {
		return DEST_MSISDN;
	}
	public void setDEST_MSISDN(String dEST_MSISDN) {
		DEST_MSISDN = dEST_MSISDN;
	}
	public double getAMOUNT() {
		return AMOUNT;
	}
	public void setAMOUNT(double aMOUNT) {
		AMOUNT = aMOUNT;
	}
	public double getSOURCE_BALANCE_BEFORE() {
		return SOURCE_BALANCE_BEFORE;
	}
	public void setSOURCE_BALANCE_BEFORE(double sOURCE_BALANCE_BEFORE) {
		SOURCE_BALANCE_BEFORE = sOURCE_BALANCE_BEFORE;
	}
	public double getSOURCE_BALANCE_AFTER() {
		return SOURCE_BALANCE_AFTER;
	}
	public void setSOURCE_BALANCE_AFTER(double sOURCE_BALANCE_AFTER) {
		SOURCE_BALANCE_AFTER = sOURCE_BALANCE_AFTER;
	}
	public int getDEST_CIRCLE_ID() {
		return DEST_CIRCLE_ID;
	}
	public void setDEST_CIRCLE_ID(int dEST_CIRCLE_ID) {
		DEST_CIRCLE_ID = dEST_CIRCLE_ID;
	}
	public int getSOURCE_CIRCLE_ID() {
		return SOURCE_CIRCLE_ID;
	}
	public void setSOURCE_CIRCLE_ID(int sOURCE_CIRCLE_ID) {
		SOURCE_CIRCLE_ID = sOURCE_CIRCLE_ID;
	}
	
	@Override
    public String toString() {
        String json = JsonConverter.INSTANCE.asJsonString(this);
        return json;
    }

}
