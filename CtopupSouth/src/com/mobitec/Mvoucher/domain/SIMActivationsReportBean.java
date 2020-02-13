package com.mobitec.Mvoucher.domain;

import java.util.Date;

import com.mobitec.Mvoucher.jsonconv.JsonConverter;

public class SIMActivationsReportBean {
	
	private int DEALER_ID;
	private String AUTHORISED_MOBILE_NUMBER;
	private String B_MONTH;
	private String B_YEAR;
	private int MIN_NO_OF_SALE;
	private int NO_OF_SALES;
	private String RECEIPT_NO;
	private double TOT_FACE_VALUE;
	private double BONUS_DISC_PERCENT;
	private double DISC_AMOUNT_APPR;
	private Date INS_DATE;
	private String CIRCLE_ID;
	private String SSA_ID;
	
	
	public SIMActivationsReportBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SIMActivationsReportBean(int dEALER_ID, String aUTHORISED_MOBILE_NUMBER, String b_MONTH, String b_YEAR,
			int mIN_NO_OF_SALE, int nO_OF_SALES, String rECEIPT_NO, double tOT_FACE_VALUE, double bONUS_DISC_PERCENT,
			double dISC_AMOUNT_APPR, Date iNS_DATE, String cIRCLE_ID, String sSA_ID) {
		super();
		DEALER_ID = dEALER_ID;
		AUTHORISED_MOBILE_NUMBER = aUTHORISED_MOBILE_NUMBER;
		B_MONTH = b_MONTH;
		B_YEAR = b_YEAR;
		MIN_NO_OF_SALE = mIN_NO_OF_SALE;
		NO_OF_SALES = nO_OF_SALES;
		RECEIPT_NO = rECEIPT_NO;
		TOT_FACE_VALUE = tOT_FACE_VALUE;
		BONUS_DISC_PERCENT = bONUS_DISC_PERCENT;
		DISC_AMOUNT_APPR = dISC_AMOUNT_APPR;
		INS_DATE = iNS_DATE;
		CIRCLE_ID = cIRCLE_ID;
		SSA_ID = sSA_ID;
	}
	public int getDEALER_ID() {
		return DEALER_ID;
	}
	public void setDEALER_ID(int dEALER_ID) {
		DEALER_ID = dEALER_ID;
	}
	public String getAUTHORISED_MOBILE_NUMBER() {
		return AUTHORISED_MOBILE_NUMBER;
	}
	public void setAUTHORISED_MOBILE_NUMBER(String aUTHORISED_MOBILE_NUMBER) {
		AUTHORISED_MOBILE_NUMBER = aUTHORISED_MOBILE_NUMBER;
	}
	public String getB_MONTH() {
		return B_MONTH;
	}
	public void setB_MONTH(String b_MONTH) {
		B_MONTH = b_MONTH;
	}
	public String getB_YEAR() {
		return B_YEAR;
	}
	public void setB_YEAR(String b_YEAR) {
		B_YEAR = b_YEAR;
	}
	public int getMIN_NO_OF_SALE() {
		return MIN_NO_OF_SALE;
	}
	public void setMIN_NO_OF_SALE(int mIN_NO_OF_SALE) {
		MIN_NO_OF_SALE = mIN_NO_OF_SALE;
	}
	public int getNO_OF_SALES() {
		return NO_OF_SALES;
	}
	public void setNO_OF_SALES(int nO_OF_SALES) {
		NO_OF_SALES = nO_OF_SALES;
	}
	public String getRECEIPT_NO() {
		return RECEIPT_NO;
	}
	public void setRECEIPT_NO(String rECEIPT_NO) {
		RECEIPT_NO = rECEIPT_NO;
	}
	public double getTOT_FACE_VALUE() {
		return TOT_FACE_VALUE;
	}
	public void setTOT_FACE_VALUE(double tOT_FACE_VALUE) {
		TOT_FACE_VALUE = tOT_FACE_VALUE;
	}
	public double getBONUS_DISC_PERCENT() {
		return BONUS_DISC_PERCENT;
	}
	public void setBONUS_DISC_PERCENT(double bONUS_DISC_PERCENT) {
		BONUS_DISC_PERCENT = bONUS_DISC_PERCENT;
	}
	public double getDISC_AMOUNT_APPR() {
		return DISC_AMOUNT_APPR;
	}
	public void setDISC_AMOUNT_APPR(double dISC_AMOUNT_APPR) {
		DISC_AMOUNT_APPR = dISC_AMOUNT_APPR;
	}
	public Date getINS_DATE() {
		return INS_DATE;
	}
	public void setINS_DATE(Date iNS_DATE) {
		INS_DATE = iNS_DATE;
	}
	public String getCIRCLE_ID() {
		return CIRCLE_ID;
	}
	public void setCIRCLE_ID(String cIRCLE_ID) {
		CIRCLE_ID = cIRCLE_ID;
	}
	public String getSSA_ID() {
		return SSA_ID;
	}
	public void setSSA_ID(String sSA_ID) {
		SSA_ID = sSA_ID;
	}
	
	@Override
    public String toString() {
        String json = JsonConverter.INSTANCE.asJsonString(this);
        return json;
    }
	

}


/*DEALER_ID          NOT NULL NUMBER=DealerId,
AUTHORISED_MOBILE_NUMBER       VARCHAR2(15)   =Auth_MSISDN 
B_MONTH            NOT NULL VARCHAR2(15)=Month, 
B_YEAR                      VARCHAR2(4) =Year, 
MIN_NO_OF_SALE        number =SIMTarget,  
NO_OF_SALES        NOT NULL NUMBER =SIMSales,
RECEIPT_NO                  VARCHAR2(15) =SIMActId,
TOT_FACE_VALUE              NUMBER =Face_Value, 
BONUS_DISC_PERCENT NOT NULL NUMBER =Disc(In%),
DISC_AMOUNT_APPR   NOT NULL NUMBER=Add_Discount, 
INS_DATE           NOT NULL DATE =Date,            
CIRCLE_ID          NOT NULL NUMBER=Circle,       
SSA_ID             NOT NULL NUMBER  =SSA */