package com.mobitec.Mvoucher.domain;

import com.mobitec.Mvoucher.jsonconv.JsonConverter;

public class FRCReportBean {
	private String CIRCLE_NAME;
	private String FRANCHISEE_SSA;
	private String Franchisee_name;
	private String Franchisee_NUMBER;
	private String Franchisee_ID;
	private String FRANCHISEE_CATEGORY;
	private int FRC_DENOMINATION;
	private double SELLER_COMM;
	private String sub_comm;
	private int FRA_COMM;
	private int tds_value;
	private String COMMISSION_TYPE;
	
	
	public FRCReportBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public FRCReportBean(String cIRCLE_NAME, String fRANCHISEE_SSA, String franchisee_name, String franchisee_NUMBER,
			String franchisee_ID, String fRANCHISEE_CATEGORY, int fRC_DENOMINATION, double sELLER_COMM, String sub_comm,
			int fRA_COMM, int tds_value, String cOMMISSION_TYPE) {
		super();
		CIRCLE_NAME = cIRCLE_NAME;
		FRANCHISEE_SSA = fRANCHISEE_SSA;
		Franchisee_name = franchisee_name;
		Franchisee_NUMBER = franchisee_NUMBER;
		Franchisee_ID = franchisee_ID;
		FRANCHISEE_CATEGORY = fRANCHISEE_CATEGORY;
		FRC_DENOMINATION = fRC_DENOMINATION;
		SELLER_COMM = sELLER_COMM;
		this.sub_comm = sub_comm;
		FRA_COMM = fRA_COMM;
		this.tds_value = tds_value;
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


	public String getFranchisee_name() {
		return Franchisee_name;
	}


	public void setFranchisee_name(String franchisee_name) {
		Franchisee_name = franchisee_name;
	}


	public String getFranchisee_NUMBER() {
		return Franchisee_NUMBER;
	}


	public void setFranchisee_NUMBER(String franchisee_NUMBER) {
		Franchisee_NUMBER = franchisee_NUMBER;
	}


	public String getFranchisee_ID() {
		return Franchisee_ID;
	}


	public void setFranchisee_ID(String franchisee_ID) {
		Franchisee_ID = franchisee_ID;
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


	public double getSELLER_COMM() {
		return SELLER_COMM;
	}


	public void setSELLER_COMM(double sELLER_COMM) {
		SELLER_COMM = sELLER_COMM;
	}


	public String getSub_comm() {
		return sub_comm;
	}


	public void setSub_comm(String sub_comm) {
		this.sub_comm = sub_comm;
	}


	public int getFRA_COMM() {
		return FRA_COMM;
	}


	public void setFRA_COMM(int fRA_COMM) {
		FRA_COMM = fRA_COMM;
	}


	public int getTds_value() {
		return tds_value;
	}


	public void setTds_value(int tds_value) {
		this.tds_value = tds_value;
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
