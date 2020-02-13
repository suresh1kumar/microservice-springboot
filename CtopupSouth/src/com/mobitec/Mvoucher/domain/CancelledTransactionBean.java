package com.mobitec.Mvoucher.domain;

import java.util.Date;


import com.mobitec.Mvoucher.jsonconv.JsonConverter;

public class CancelledTransactionBean {

	private int DEALER_ID;
	private String TRANSACTION_ID;
	private String AUTHORISED_MOBILE_NUMBER;
	private Date TRANSACTION_TIME;
	private String TRANSACTION_TYPE;
	private double AMOUNT;
	private Date CANCEL_DATE;
	private String LAST_UPDATED;
	
	public CancelledTransactionBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CancelledTransactionBean(int dEALER_ID, String tRANSACTION_ID, String aUTHORISED_MOBILE_NUMBER,
			Date tRANSACTION_TIME, String tRANSACTION_TYPE, double aMOUNT, Date cANCEL_DATE, String lAST_UPDATED) {
		super();
		DEALER_ID = dEALER_ID;
		TRANSACTION_ID = tRANSACTION_ID;
		AUTHORISED_MOBILE_NUMBER = aUTHORISED_MOBILE_NUMBER;
		TRANSACTION_TIME = tRANSACTION_TIME;
		TRANSACTION_TYPE = tRANSACTION_TYPE;
		AMOUNT = aMOUNT;
		CANCEL_DATE = cANCEL_DATE;
		LAST_UPDATED = lAST_UPDATED;
	}
	
	public int getDEALER_ID() {
		return DEALER_ID;
	}

	public void setDEALER_ID(int dEALER_ID) {
		DEALER_ID = dEALER_ID;
	}

	public String getTRANSACTION_ID() {
		return TRANSACTION_ID;
	}

	public void setTRANSACTION_ID(String tRANSACTION_ID) {
		TRANSACTION_ID = tRANSACTION_ID;
	}

	public String getAUTHORISED_MOBILE_NUMBER() {
		return AUTHORISED_MOBILE_NUMBER;
	}

	public void setAUTHORISED_MOBILE_NUMBER(String aUTHORISED_MOBILE_NUMBER) {
		AUTHORISED_MOBILE_NUMBER = aUTHORISED_MOBILE_NUMBER;
	}

	public Date getTRANSACTION_TIME() {
		return TRANSACTION_TIME;
	}

	public void setTRANSACTION_TIME(Date tRANSACTION_TIME) {
		TRANSACTION_TIME = tRANSACTION_TIME;
	}

	public String getTRANSACTION_TYPE() {
		return TRANSACTION_TYPE;
	}

	public void setTRANSACTION_TYPE(String tRANSACTION_TYPE) {
		TRANSACTION_TYPE = tRANSACTION_TYPE;
	}

	public double getAMOUNT() {
		return AMOUNT;
	}

	public void setAMOUNT(double aMOUNT) {
		AMOUNT = aMOUNT;
	}

	public Date getCANCEL_DATE() {
		return CANCEL_DATE;
	}

	public void setCANCEL_DATE(Date cANCEL_DATE) {
		CANCEL_DATE = cANCEL_DATE;
	}

	public String getLAST_UPDATED() {
		return LAST_UPDATED;
	}

	public void setLAST_UPDATED(String lAST_UPDATED) {
		LAST_UPDATED = lAST_UPDATED;
	}

	

	@Override
    public String toString() {
        String json = JsonConverter.INSTANCE.asJsonString(this);
        return json;
    }
	
}











/*DEALER_ID                      NUMBER      =dealer_id 
TRANSACTION_ID                 VARCHAR2(16) =transaction_id,
AUTHORISED_MOBILE_NUMBER       VARCHAR2(15)=authorised_mobile_number, 
TRANSACTION_TIME               DATE      =transaction_time   
TRANSACTION_TYPE               VARCHAR2(40) =transaction_type,
AMOUNT                         NUMBER       =amount,
CANCEL_DATE                    DATE   =cancel_date,      
LAST_UPDATED                   VARCHAR2(20) =last_updated*/
