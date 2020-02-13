package com.mobitec.Mvoucher.domain;

import com.mobitec.Mvoucher.jsonconv.JsonConverter;


public class KYCReportBean2 {
	private String CIRCLE;
	private String SSA;
	private int DENOMINATION;
	private int TOT_CNT;
	private int TOT_AMT;
	
	public KYCReportBean2() {
		super();
	}

	public KYCReportBean2(String cIRCLE, String sSA, int dENOMINATION, int tOT_CNT, int tOT_AMT) {
		super();
		CIRCLE = cIRCLE;
		SSA = sSA;
		DENOMINATION = dENOMINATION;
		TOT_CNT = tOT_CNT;
		TOT_AMT = tOT_AMT;
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

	public int getDENOMINATION() {
		return DENOMINATION;
	}

	public void setDENOMINATION(int dENOMINATION) {
		DENOMINATION = dENOMINATION;
	}

	public int getTOT_CNT() {
		return TOT_CNT;
	}

	public void setTOT_CNT(int tOT_CNT) {
		TOT_CNT = tOT_CNT;
	}

	public int getTOT_AMT() {
		return TOT_AMT;
	}

	public void setTOT_AMT(int tOT_AMT) {
		TOT_AMT = tOT_AMT;
	}

	@Override
    public String toString() {
        String json = JsonConverter.INSTANCE.asJsonString(this);
        return json;
    }
	

}
