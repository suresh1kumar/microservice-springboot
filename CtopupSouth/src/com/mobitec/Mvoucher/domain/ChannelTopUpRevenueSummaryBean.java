package com.mobitec.Mvoucher.domain;

import java.util.Date;

import com.mobitec.Mvoucher.jsonconv.JsonConverter;

public class ChannelTopUpRevenueSummaryBean {

	private Date TIMESTAMP;
	private int NUMBER_OF_DEALERS;
	private int USED_DEALER;
	private double ALLOCATIONS;
	private int RECHARGE_QUANTITY;
	private double RECHARGE_AMOUNT;
	private int TOPUP_QUANTITY;
	private double TOPUP_AMOUNT;
	private int NUMBER_OF_MOVEMENTS;
	private double MOVEMENTS;
	
	public ChannelTopUpRevenueSummaryBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChannelTopUpRevenueSummaryBean(Date tIMESTAMP, int nUMBER_OF_DEALERS, int uSED_DEALER, double aLLOCATIONS,
			int rECHARGE_QUANTITY, double rECHARGE_AMOUNT, int tOPUP_QUANTITY, double tOPUP_AMOUNT,
			int nUMBER_OF_MOVEMENTS, double mOVEMENTS) {
		super();
		TIMESTAMP = tIMESTAMP;
		NUMBER_OF_DEALERS = nUMBER_OF_DEALERS;
		USED_DEALER = uSED_DEALER;
		ALLOCATIONS = aLLOCATIONS;
		RECHARGE_QUANTITY = rECHARGE_QUANTITY;
		RECHARGE_AMOUNT = rECHARGE_AMOUNT;
		TOPUP_QUANTITY = tOPUP_QUANTITY;
		TOPUP_AMOUNT = tOPUP_AMOUNT;
		NUMBER_OF_MOVEMENTS = nUMBER_OF_MOVEMENTS;
		MOVEMENTS = mOVEMENTS;
	}

	public Date getTIMESTAMP() {
		return TIMESTAMP;
	}

	public void setTIMESTAMP(Date tIMESTAMP) {
		TIMESTAMP = tIMESTAMP;
	}

	public int getNUMBER_OF_DEALERS() {
		return NUMBER_OF_DEALERS;
	}

	public void setNUMBER_OF_DEALERS(int nUMBER_OF_DEALERS) {
		NUMBER_OF_DEALERS = nUMBER_OF_DEALERS;
	}

	public int getUSED_DEALER() {
		return USED_DEALER;
	}

	public void setUSED_DEALER(int uSED_DEALER) {
		USED_DEALER = uSED_DEALER;
	}

	public double getALLOCATIONS() {
		return ALLOCATIONS;
	}

	public void setALLOCATIONS(double aLLOCATIONS) {
		ALLOCATIONS = aLLOCATIONS;
	}

	public int getRECHARGE_QUANTITY() {
		return RECHARGE_QUANTITY;
	}

	public void setRECHARGE_QUANTITY(int rECHARGE_QUANTITY) {
		RECHARGE_QUANTITY = rECHARGE_QUANTITY;
	}

	public double getRECHARGE_AMOUNT() {
		return RECHARGE_AMOUNT;
	}

	public void setRECHARGE_AMOUNT(double rECHARGE_AMOUNT) {
		RECHARGE_AMOUNT = rECHARGE_AMOUNT;
	}

	public int getTOPUP_QUANTITY() {
		return TOPUP_QUANTITY;
	}

	public void setTOPUP_QUANTITY(int tOPUP_QUANTITY) {
		TOPUP_QUANTITY = tOPUP_QUANTITY;
	}

	public double getTOPUP_AMOUNT() {
		return TOPUP_AMOUNT;
	}

	public void setTOPUP_AMOUNT(double tOPUP_AMOUNT) {
		TOPUP_AMOUNT = tOPUP_AMOUNT;
	}

	public int getNUMBER_OF_MOVEMENTS() {
		return NUMBER_OF_MOVEMENTS;
	}

	public void setNUMBER_OF_MOVEMENTS(int nUMBER_OF_MOVEMENTS) {
		NUMBER_OF_MOVEMENTS = nUMBER_OF_MOVEMENTS;
	}

	public double getMOVEMENTS() {
		return MOVEMENTS;
	}

	public void setMOVEMENTS(double mOVEMENTS) {
		MOVEMENTS = mOVEMENTS;
	}
	
	@Override
    public String toString() {
        String json = JsonConverter.INSTANCE.asJsonString(this);
        return json;
    }
	
	
}






/*TIMESTAMP                    DATE   =timestamp      
NUMBER_OF_DEALERS            NUMBER =number_of_dealers,    
USED_DEALER                  NUMBER =used_dealer,      
ALLOCATIONS                  NUMBER =allocations,=double      
RECHARGE_QUANTITY            NUMBER =recharge_quantity,      
RECHARGE_AMOUNT              NUMBER =recharge_amount,=double      
TOPUP_QUANTITY               NUMBER =topup_quantity,      
TOPUP_AMOUNT                 NUMBER = topup_amount,  =double   
NUMBER_OF_MOVEMENTS          NUMBER =number_of_movements,      
MOVEMENTS                    NUMBER = movements =double  */