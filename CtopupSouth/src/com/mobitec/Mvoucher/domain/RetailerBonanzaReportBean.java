package com.mobitec.Mvoucher.domain;

import java.util.Date;

import com.mobitec.Mvoucher.jsonconv.JsonConverter;

public class RetailerBonanzaReportBean {
	
	private double AMOUNT;
	private String STATUS;
	private String ALLOCATED_USER;
	private String APPROVED_USER;
	private Date ALLOCATED_DATE;
	private Date APPROVED_DATE;
	
	
	public RetailerBonanzaReportBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public RetailerBonanzaReportBean(double aMOUNT, String sTATUS, String aLLOCATED_USER, String aPPROVED_USER,
			Date aLLOCATED_DATE, Date aPPROVED_DATE) {
		super();
		AMOUNT = aMOUNT;
		STATUS = sTATUS;
		ALLOCATED_USER = aLLOCATED_USER;
		APPROVED_USER = aPPROVED_USER;
		ALLOCATED_DATE = aLLOCATED_DATE;
		APPROVED_DATE = aPPROVED_DATE;
	}
	
	public double getAMOUNT() {
		return AMOUNT;
	}


	public void setAMOUNT(double aMOUNT) {
		AMOUNT = aMOUNT;
	}


	public String getSTATUS() {
		return STATUS;
	}


	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}


	public String getALLOCATED_USER() {
		return ALLOCATED_USER;
	}


	public void setALLOCATED_USER(String aLLOCATED_USER) {
		ALLOCATED_USER = aLLOCATED_USER;
	}


	public String getAPPROVED_USER() {
		return APPROVED_USER;
	}


	public void setAPPROVED_USER(String aPPROVED_USER) {
		APPROVED_USER = aPPROVED_USER;
	}


	public Date getALLOCATED_DATE() {
		return ALLOCATED_DATE;
	}


	public void setALLOCATED_DATE(Date aLLOCATED_DATE) {
		ALLOCATED_DATE = aLLOCATED_DATE;
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





/*AMOUNT                            NUMBER 
STATUS                            VARCHAR2(20)  
ALLOCATED_USER                    VARCHAR2(50)
APPROVED_USER                     VARCHAR2(50)
ALLOCATED_DATE                    DATE 
APPROVED_DATE                     DATE*/