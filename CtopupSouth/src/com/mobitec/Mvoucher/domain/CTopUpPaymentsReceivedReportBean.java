package com.mobitec.Mvoucher.domain;

import java.util.Date;

import com.mobitec.Mvoucher.jsonconv.JsonConverter;

public class CTopUpPaymentsReceivedReportBean {
	
	private String c_fullname;
	private Date timestamp;
	private String DEALERTYPE;
	private String dealer_code;
	private String AUTHORISED_MOBILE_NUMBER;
	private double full_amount;
	private String RECEIPT_NO;
	private String PAYMENT_MODE;
	private String CHECK_DD_NUM;
	private double amount;
	private double service_tax;
	private double dlr_commission;
	private int tds;
	private int sur_charge;
	private int ses;
	private double face_value;
	public CTopUpPaymentsReceivedReportBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CTopUpPaymentsReceivedReportBean(String c_fullname, Date timestamp, String dEALERTYPE, String dealer_code,
			String aUTHORISED_MOBILE_NUMBER, double full_amount, String rECEIPT_NO, String pAYMENT_MODE,
			String cHECK_DD_NUM, double amount, double service_tax, double dlr_commission, int tds, int sur_charge,
			int ses, double face_value) {
		super();
		this.c_fullname = c_fullname;
		this.timestamp = timestamp;
		DEALERTYPE = dEALERTYPE;
		this.dealer_code = dealer_code;
		AUTHORISED_MOBILE_NUMBER = aUTHORISED_MOBILE_NUMBER;
		this.full_amount = full_amount;
		RECEIPT_NO = rECEIPT_NO;
		PAYMENT_MODE = pAYMENT_MODE;
		CHECK_DD_NUM = cHECK_DD_NUM;
		this.amount = amount;
		this.service_tax = service_tax;
		this.dlr_commission = dlr_commission;
		this.tds = tds;
		this.sur_charge = sur_charge;
		this.ses = ses;
		this.face_value = face_value;
	}
	public String getC_fullname() {
		return c_fullname;
	}
	public void setC_fullname(String c_fullname) {
		this.c_fullname = c_fullname;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getDEALERTYPE() {
		return DEALERTYPE;
	}
	public void setDEALERTYPE(String dEALERTYPE) {
		DEALERTYPE = dEALERTYPE;
	}
	public String getDealer_code() {
		return dealer_code;
	}
	public void setDealer_code(String dealer_code) {
		this.dealer_code = dealer_code;
	}
	public String getAUTHORISED_MOBILE_NUMBER() {
		return AUTHORISED_MOBILE_NUMBER;
	}
	public void setAUTHORISED_MOBILE_NUMBER(String aUTHORISED_MOBILE_NUMBER) {
		AUTHORISED_MOBILE_NUMBER = aUTHORISED_MOBILE_NUMBER;
	}
	public double getFull_amount() {
		return full_amount;
	}
	public void setFull_amount(double full_amount) {
		this.full_amount = full_amount;
	}
	public String getRECEIPT_NO() {
		return RECEIPT_NO;
	}
	public void setRECEIPT_NO(String rECEIPT_NO) {
		RECEIPT_NO = rECEIPT_NO;
	}
	public String getPAYMENT_MODE() {
		return PAYMENT_MODE;
	}
	public void setPAYMENT_MODE(String pAYMENT_MODE) {
		PAYMENT_MODE = pAYMENT_MODE;
	}
	public String getCHECK_DD_NUM() {
		return CHECK_DD_NUM;
	}
	public void setCHECK_DD_NUM(String cHECK_DD_NUM) {
		CHECK_DD_NUM = cHECK_DD_NUM;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getService_tax() {
		return service_tax;
	}
	public void setService_tax(double service_tax) {
		this.service_tax = service_tax;
	}
	public double getDlr_commission() {
		return dlr_commission;
	}
	public void setDlr_commission(double dlr_commission) {
		this.dlr_commission = dlr_commission;
	}
	public int getTds() {
		return tds;
	}
	public void setTds(int tds) {
		this.tds = tds;
	}
	public int getSur_charge() {
		return sur_charge;
	}
	public void setSur_charge(int sur_charge) {
		this.sur_charge = sur_charge;
	}
	public int getSes() {
		return ses;
	}
	public void setSes(int ses) {
		this.ses = ses;
	}
	public double getFace_value() {
		return face_value;
	}
	public void setFace_value(double face_value) {
		this.face_value = face_value;
	}
	
	@Override
    public String toString() {
        String json = JsonConverter.INSTANCE.asJsonString(this);
        return json;
    }
	

}














/*C_FULLNAME                        VARCHAR2(50) =c_fullname,
TIMESTAMP                         DATE  =to_char(timestamp,'dd-mm-yyyy hh24:mi:ss'),
DEALERTYPE                        VARCHAR2(50)=DEALERTYPE,
DEALER_CODE                       VARCHAR2(50)  =dealer_code,
AUTHORISED_MOBILE_NUMBER          VARCHAR2(15)  =AUTHORISED_MOBILE_NUMBER,
FULL_AMOUNT                       NUMBER =nvl(full_amount,0),
RECEIPT_NO                        VARCHAR2(50) =RECEIPT_NO,
PAYMENT_MODE                      VARCHAR2(50)  =PAYMENT_MODE,
CHECK_DD_NUM                      VARCHAR2(500) =CHECK_DD_NUM,
AMOUNT                            NUMBER=nvl(amount,0),
SERVICE_TAX                       NUMBER=nvl(service_tax,0),
DLR_COMMISSION                    NUMBER=nvl(dlr_commission,0),
TDS                               NUMBER=nvl(tds,0),
SUR_CHARGE                        NUMBER =nvl(sur_charge,0),
SES                               NUMBER =nvl(ses,0),
FACE_VALUE                        NUMBER(15,2) =nvl(face_value,0) */








