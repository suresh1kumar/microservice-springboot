package com.mobitec.Mvoucher.domain;

import java.util.Date;

import com.mobitec.Mvoucher.jsonconv.JsonConverter;

public class StockCancellationReportBean {
	/*Allocation Date,   =time
			 Franchise Code,= DEALER_CODE==string
			Amount Cancelled In Rs.,= AMOUNT==no
			Receipt No,= RECEIPT_NO==string
			Payment Mode,= PAYMENT_MODE==string
			DD/Cheque No.,= CHECK_DD_NUM==string
			Value Cancelled In Rs.,= FULL_AMOUNT==no
			Service Tax In Rs.,= SERVICE_TAX==no
			Commission/Discount In Rs.,= DLR_COMMISSION==no
			TDS In Rs.,= TDS==no
			Surcharge In Rs.,= SUR_CHARGE==no
			CESS In Rs.= SES==no*/
	private Date time;
	
	private String DEALER_CODE;
	private Double AMOUNT;
	private String RECEIPT_NO;
	private String PAYMENT_MODE;
	private String CHECK_DD_NUM;
	private Double FULL_AMOUNT;
	private Double SERVICE_TAX;
	private Double DLR_COMMISSION;
	private int TDS;
	private int SUR_CHARGE;
	private int SES;
			
	public StockCancellationReportBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StockCancellationReportBean(Date time, String dEALER_CODE, Double aMOUNT, String rECEIPT_NO, String pAYMENT_MODE,
			String cHECK_DD_NUM, Double fULL_AMOUNT, Double sERVICE_TAX, Double dLR_COMMISSION, int tDS, int sUR_CHARGE,
			int sES) {
		super();
		this.time = time;
		DEALER_CODE = dEALER_CODE;
		AMOUNT = aMOUNT;
		RECEIPT_NO = rECEIPT_NO;
		PAYMENT_MODE = pAYMENT_MODE;
		CHECK_DD_NUM = cHECK_DD_NUM;
		FULL_AMOUNT = fULL_AMOUNT;
		SERVICE_TAX = sERVICE_TAX;
		DLR_COMMISSION = dLR_COMMISSION;
		TDS = tDS;
		SUR_CHARGE = sUR_CHARGE;
		SES = sES;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getDEALER_CODE() {
		return DEALER_CODE;
	}

	public void setDEALER_CODE(String dEALER_CODE) {
		DEALER_CODE = dEALER_CODE;
	}

	public Double getAMOUNT() {
		return AMOUNT;
	}

	public void setAMOUNT(Double aMOUNT) {
		AMOUNT = aMOUNT;
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

	public Double getFULL_AMOUNT() {
		return FULL_AMOUNT;
	}

	public void setFULL_AMOUNT(Double fULL_AMOUNT) {
		FULL_AMOUNT = fULL_AMOUNT;
	}

	public Double getSERVICE_TAX() {
		return SERVICE_TAX;
	}

	public void setSERVICE_TAX(Double sERVICE_TAX) {
		SERVICE_TAX = sERVICE_TAX;
	}

	public Double getDLR_COMMISSION() {
		return DLR_COMMISSION;
	}

	public void setDLR_COMMISSION(Double dLR_COMMISSION) {
		DLR_COMMISSION = dLR_COMMISSION;
	}

	public int getTDS() {
		return TDS;
	}

	public void setTDS(int tDS) {
		TDS = tDS;
	}

	public int getSUR_CHARGE() {
		return SUR_CHARGE;
	}

	public void setSUR_CHARGE(int sUR_CHARGE) {
		SUR_CHARGE = sUR_CHARGE;
	}

	public int getSES() {
		return SES;
	}

	public void setSES(int sES) {
		SES = sES;
	}
	
	@Override
    public String toString() {
        String json = JsonConverter.INSTANCE.asJsonString(this);
        return json;
    }
	
	
}
