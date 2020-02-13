package com.mobitec.Mvoucher.domain;

import java.util.Date;

import com.mobitec.Mvoucher.jsonconv.JsonConverter;

public class BulkRechargeReportBean {
	
	private Date CREATED_TIMESTAMP;
	private String SOURCE_MSISDN;
	private String DEST_MSISDN;
	private double AMOUNT;
	private Date transaction_type;
	private int STATUS;
	
	public BulkRechargeReportBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BulkRechargeReportBean(Date cREATED_TIMESTAMP, String sOURCE_MSISDN, String dEST_MSISDN, double aMOUNT,
			Date transaction_type, int sTATUS) {
		super();
		CREATED_TIMESTAMP = cREATED_TIMESTAMP;
		SOURCE_MSISDN = sOURCE_MSISDN;
		DEST_MSISDN = dEST_MSISDN;
		AMOUNT = aMOUNT;
		this.transaction_type = transaction_type;
		STATUS = sTATUS;
	}
	public Date getCREATED_TIMESTAMP() {
		return CREATED_TIMESTAMP;
	}
	public void setCREATED_TIMESTAMP(Date cREATED_TIMESTAMP) {
		CREATED_TIMESTAMP = cREATED_TIMESTAMP;
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
	public Date getTransaction_type() {
		return transaction_type;
	}
	public void setTransaction_type(Date transaction_type) {
		this.transaction_type = transaction_type;
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
/*CREATED_TIMESTAMP,=CREATED_TIMESTAMP           DATE
source_msisdn,=SOURCE_MSISDN               VARCHAR2(20) 
dest_msisdn,=DEST_MSISDN                 VARCHAR2(20)
amount,=AMOUNT                      NUMBER   
DECODE(transaction_type,10,'Recharge',4,'Topup',12,'Flexy') AS transaction_type,=CREATED_TIMESTAMP           DATE 
DECODE(status, 2, 'SUCCESS', 'FAILURE') AS STATUS =STATUS                      NUMBER */