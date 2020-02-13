package com.mobitec.Mvoucher.domain;

import com.mobitec.Mvoucher.jsonconv.JsonConverter;

public class DealerInfoSearchBean {
	
	 private String DEALER_CODE;
	 private String FIRST_NAME;
	 private String  SECOND_NAME;
	 private String LAST_NAME;
	 private String CONTACT_NUMBER;
	 private String MOBILE_NUMBER;
	 private String AUTHORISED_MOBILE_NUMBER;
	 private String DEALER_STATUS;
	 
	 
	public DealerInfoSearchBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DealerInfoSearchBean(String dEALER_CODE, String fIRST_NAME, String sECOND_NAME, String lAST_NAME,
			String cONTACT_NUMBER, String mOBILE_NUMBER, String aUTHORISED_MOBILE_NUMBER, String dEALER_STATUS) {
		super();
		DEALER_CODE = dEALER_CODE;
		FIRST_NAME = fIRST_NAME;
		SECOND_NAME = sECOND_NAME;
		LAST_NAME = lAST_NAME;
		CONTACT_NUMBER = cONTACT_NUMBER;
		MOBILE_NUMBER = mOBILE_NUMBER;
		AUTHORISED_MOBILE_NUMBER = aUTHORISED_MOBILE_NUMBER;
		DEALER_STATUS = dEALER_STATUS;
	}
	public String getDEALER_CODE() {
		return DEALER_CODE;
	}
	public void setDEALER_CODE(String dEALER_CODE) {
		DEALER_CODE = dEALER_CODE;
	}
	public String getFIRST_NAME() {
		return FIRST_NAME;
	}
	public void setFIRST_NAME(String fIRST_NAME) {
		FIRST_NAME = fIRST_NAME;
	}
	public String getSECOND_NAME() {
		return SECOND_NAME;
	}
	public void setSECOND_NAME(String sECOND_NAME) {
		SECOND_NAME = sECOND_NAME;
	}
	public String getLAST_NAME() {
		return LAST_NAME;
	}
	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}
	public String getCONTACT_NUMBER() {
		return CONTACT_NUMBER;
	}
	public void setCONTACT_NUMBER(String cONTACT_NUMBER) {
		CONTACT_NUMBER = cONTACT_NUMBER;
	}
	public String getMOBILE_NUMBER() {
		return MOBILE_NUMBER;
	}
	public void setMOBILE_NUMBER(String mOBILE_NUMBER) {
		MOBILE_NUMBER = mOBILE_NUMBER;
	}
	public String getAUTHORISED_MOBILE_NUMBER() {
		return AUTHORISED_MOBILE_NUMBER;
	}
	public void setAUTHORISED_MOBILE_NUMBER(String aUTHORISED_MOBILE_NUMBER) {
		AUTHORISED_MOBILE_NUMBER = aUTHORISED_MOBILE_NUMBER;
	}
	public String getDEALER_STATUS() {
		return DEALER_STATUS;
	}
	public void setDEALER_STATUS(String dEALER_STATUS) {
		DEALER_STATUS = dEALER_STATUS;
	}
	 
	 

	@Override
    public String toString() {
        String json = JsonConverter.INSTANCE.asJsonString(this);
        return json;
    }
	
	

}
