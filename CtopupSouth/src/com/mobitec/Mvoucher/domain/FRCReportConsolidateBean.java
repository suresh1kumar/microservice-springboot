package com.mobitec.Mvoucher.domain;

import com.mobitec.Mvoucher.jsonconv.JsonConverter;

public class FRCReportConsolidateBean {
	
	private String CIRCLE_NAME;
	private String FRANCHISEE_SSA;
	private String FRANCHISEE_NAME;
	private String FRANCHISEE_NUMBER;
	private String FRANCHISEE_ID;
	private String FRANCHISEE_CATEGORY;
	private int FRC_DENOMINATION;
	private int TRANS_COUNT;
	
	private int SELL_COMM;
	private int SUB_FRA_COMM;
	private int FRAN_COMM;
	private int TDS_VALUE;
	private int TOT_TDS;
	private String COMMISSION_TYPE;
	

	public FRCReportConsolidateBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public FRCReportConsolidateBean(String cIRCLE_NAME, String fRANCHISEE_SSA, String fRANCHISEE_NAME,
			String fRANCHISEE_NUMBER, String fRANCHISEE_ID, String fRANCHISEE_CATEGORY, int fRC_DENOMINATION,
			int tRANS_COUNT, int sELL_COMM, int sUB_FRA_COMM, int fRAN_COMM, int tDS_VALUE, int tOT_TDS,
			String cOMMISSION_TYPE) {
		super();
		CIRCLE_NAME = cIRCLE_NAME;
		FRANCHISEE_SSA = fRANCHISEE_SSA;
		FRANCHISEE_NAME = fRANCHISEE_NAME;
		FRANCHISEE_NUMBER = fRANCHISEE_NUMBER;
		FRANCHISEE_ID = fRANCHISEE_ID;
		FRANCHISEE_CATEGORY = fRANCHISEE_CATEGORY;
		FRC_DENOMINATION = fRC_DENOMINATION;
		TRANS_COUNT = tRANS_COUNT;
		SELL_COMM = sELL_COMM;
		SUB_FRA_COMM = sUB_FRA_COMM;
		FRAN_COMM = fRAN_COMM;
		TDS_VALUE = tDS_VALUE;
		TOT_TDS = tOT_TDS;
		COMMISSION_TYPE = cOMMISSION_TYPE;
	}

	
	public String getCIRCLE_NAME() {
		return CIRCLE_NAME;
	}

	public void setCIRCLE_NAME(String cIRCLE_NAME) {
		CIRCLE_NAME = cIRCLE_NAME;
	}

	public String getFRANCHISEE_SSA() {
		return FRANCHISEE_SSA;
	}

	public void setFRANCHISEE_SSA(String fRANCHISEE_SSA) {
		FRANCHISEE_SSA = fRANCHISEE_SSA;
	}

	public String getFRANCHISEE_NAME() {
		return FRANCHISEE_NAME;
	}

	public void setFRANCHISEE_NAME(String fRANCHISEE_NAME) {
		FRANCHISEE_NAME = fRANCHISEE_NAME;
	}

	public String getFRANCHISEE_NUMBER() {
		return FRANCHISEE_NUMBER;
	}

	public void setFRANCHISEE_NUMBER(String fRANCHISEE_NUMBER) {
		FRANCHISEE_NUMBER = fRANCHISEE_NUMBER;
	}

	public String getFRANCHISEE_ID() {
		return FRANCHISEE_ID;
	}

	public void setFRANCHISEE_ID(String fRANCHISEE_ID) {
		FRANCHISEE_ID = fRANCHISEE_ID;
	}

	public String getFRANCHISEE_CATEGORY() {
		return FRANCHISEE_CATEGORY;
	}

	public void setFRANCHISEE_CATEGORY(String fRANCHISEE_CATEGORY) {
		FRANCHISEE_CATEGORY = fRANCHISEE_CATEGORY;
	}

	public int getFRC_DENOMINATION() {
		return FRC_DENOMINATION;
	}

	public void setFRC_DENOMINATION(int fRC_DENOMINATION) {
		FRC_DENOMINATION = fRC_DENOMINATION;
	}

	public int getTRANS_COUNT() {
		return TRANS_COUNT;
	}

	public void setTRANS_COUNT(int tRANS_COUNT) {
		TRANS_COUNT = tRANS_COUNT;
	}

	public int getSELL_COMM() {
		return SELL_COMM;
	}

	public void setSELL_COMM(int sELL_COMM) {
		SELL_COMM = sELL_COMM;
	}

	public int getSUB_FRA_COMM() {
		return SUB_FRA_COMM;
	}

	public void setSUB_FRA_COMM(int sUB_FRA_COMM) {
		SUB_FRA_COMM = sUB_FRA_COMM;
	}

	public int getFRAN_COMM() {
		return FRAN_COMM;
	}

	public void setFRAN_COMM(int fRAN_COMM) {
		FRAN_COMM = fRAN_COMM;
	}

	public int getTDS_VALUE() {
		return TDS_VALUE;
	}

	public void setTDS_VALUE(int tDS_VALUE) {
		TDS_VALUE = tDS_VALUE;
	}

	public int getTOT_TDS() {
		return TOT_TDS;
	}

	public void setTOT_TDS(int tOT_TDS) {
		TOT_TDS = tOT_TDS;
	}

	public String getCOMMISSION_TYPE() {
		return COMMISSION_TYPE;
	}

	public void setCOMMISSION_TYPE(String cOMMISSION_TYPE) {
		COMMISSION_TYPE = cOMMISSION_TYPE;
	}

	

	@Override
    public String toString() {
        String json = JsonConverter.INSTANCE.asJsonString(this);
        return json;
    }
	
	

}
