package com.mobitec.Mvoucher.domain;

import java.util.Date;

import com.mobitec.Mvoucher.jsonconv.JsonConverter;

public class AgentRelocationReportBean {
	
	private String C_FULLNAME;
	private String FIRST_NAME;
	private String AUTHORISED_MOBILE_NUMBER;
	private String CATEGORY_BEF;
	private String CATEGORY_AFT;
	private String REF_ID_AFT;
	private String REF_ID_BEF;
	private String MAS_ID_AFT;
	private String MAS_ID_BEF;
	private Date INSERT_DATE;
	public AgentRelocationReportBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AgentRelocationReportBean(String c_FULLNAME, String fIRST_NAME, String aUTHORISED_MOBILE_NUMBER,
			String cATEGORY_BEF, String cATEGORY_AFT, String rEF_ID_AFT, String rEF_ID_BEF, String mAS_ID_AFT,
			String mAS_ID_BEF, Date iNSERT_DATE) {
		super();
		C_FULLNAME = c_FULLNAME;
		FIRST_NAME = fIRST_NAME;
		AUTHORISED_MOBILE_NUMBER = aUTHORISED_MOBILE_NUMBER;
		CATEGORY_BEF = cATEGORY_BEF;
		CATEGORY_AFT = cATEGORY_AFT;
		REF_ID_AFT = rEF_ID_AFT;
		REF_ID_BEF = rEF_ID_BEF;
		MAS_ID_AFT = mAS_ID_AFT;
		MAS_ID_BEF = mAS_ID_BEF;
		INSERT_DATE = iNSERT_DATE;
	}
	public String getC_FULLNAME() {
		return C_FULLNAME;
	}
	public void setC_FULLNAME(String c_FULLNAME) {
		C_FULLNAME = c_FULLNAME;
	}
	public String getFIRST_NAME() {
		return FIRST_NAME;
	}
	public void setFIRST_NAME(String fIRST_NAME) {
		FIRST_NAME = fIRST_NAME;
	}
	public String getAUTHORISED_MOBILE_NUMBER() {
		return AUTHORISED_MOBILE_NUMBER;
	}
	public void setAUTHORISED_MOBILE_NUMBER(String aUTHORISED_MOBILE_NUMBER) {
		AUTHORISED_MOBILE_NUMBER = aUTHORISED_MOBILE_NUMBER;
	}
	public String getCATEGORY_BEF() {
		return CATEGORY_BEF;
	}
	public void setCATEGORY_BEF(String cATEGORY_BEF) {
		CATEGORY_BEF = cATEGORY_BEF;
	}
	public String getCATEGORY_AFT() {
		return CATEGORY_AFT;
	}
	public void setCATEGORY_AFT(String cATEGORY_AFT) {
		CATEGORY_AFT = cATEGORY_AFT;
	}
	public String getREF_ID_AFT() {
		return REF_ID_AFT;
	}
	public void setREF_ID_AFT(String rEF_ID_AFT) {
		REF_ID_AFT = rEF_ID_AFT;
	}
	public String getREF_ID_BEF() {
		return REF_ID_BEF;
	}
	public void setREF_ID_BEF(String rEF_ID_BEF) {
		REF_ID_BEF = rEF_ID_BEF;
	}
	public String getMAS_ID_AFT() {
		return MAS_ID_AFT;
	}
	public void setMAS_ID_AFT(String mAS_ID_AFT) {
		MAS_ID_AFT = mAS_ID_AFT;
	}
	public String getMAS_ID_BEF() {
		return MAS_ID_BEF;
	}
	public void setMAS_ID_BEF(String mAS_ID_BEF) {
		MAS_ID_BEF = mAS_ID_BEF;
	}
	public Date getINSERT_DATE() {
		return INSERT_DATE;
	}
	public void setINSERT_DATE(Date iNSERT_DATE) {
		INSERT_DATE = iNSERT_DATE;
	}
	
	@Override
    public String toString() {
        String json = JsonConverter.INSTANCE.asJsonString(this);
        return json;
    }
	

}
