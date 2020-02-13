package com.mobitec.Mvoucher.domain;

import com.mobitec.Mvoucher.jsonconv.JsonConverter;

public class PPSTransactionSummaryReportBean {
	
	private String DESCRIPTION;
	private String STATUS;
	private int QUE_SEQ;
	private double AMOUNT;
	

	public PPSTransactionSummaryReportBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PPSTransactionSummaryReportBean(String dESCRIPTION, String sTATUS, int qUE_SEQ, double aMOUNT) {
		super();
		DESCRIPTION = dESCRIPTION;
		STATUS = sTATUS;
		QUE_SEQ = qUE_SEQ;
		AMOUNT = aMOUNT;
	}


	
	public String getDESCRIPTION() {
		return DESCRIPTION;
	}


	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}


	public String getSTATUS() {
		return STATUS;
	}


	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}


	public int getQUE_SEQ() {
		return QUE_SEQ;
	}


	public void setQUE_SEQ(int qUE_SEQ) {
		QUE_SEQ = qUE_SEQ;
	}


	public double getAMOUNT() {
		return AMOUNT;
	}


	public void setAMOUNT(double aMOUNT) {
		AMOUNT = aMOUNT;
	}


	

	@Override
    public String toString() {
        String json = JsonConverter.INSTANCE.asJsonString(this);
        return json;
    }

	
}




/*Description,=DESCRIPTION       VARCHAR2(40) 
Status,=STATUS            VARCHAR2(299) 
Number of Transaction,=QUE_SEQ     NUMBER
Amount=AMOUNT                      NUMBER */ 