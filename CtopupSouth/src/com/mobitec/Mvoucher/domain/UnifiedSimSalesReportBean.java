package com.mobitec.Mvoucher.domain;

import java.util.Date;

import com.mobitec.Mvoucher.jsonconv.JsonConverter;

public class UnifiedSimSalesReportBean {
	
	private String MSISDN;
	private Date InsertedDate;
	private Date UpdatedDate;
	private String Status;
	
	public UnifiedSimSalesReportBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UnifiedSimSalesReportBean(String mSISDN, Date insertedDate, Date updatedDate, String status) {
		super();
		MSISDN = mSISDN;
		InsertedDate = insertedDate;
		UpdatedDate = updatedDate;
		Status = status;
	}
	public String getMSISDN() {
		return MSISDN;
	}
	public void setMSISDN(String mSISDN) {
		MSISDN = mSISDN;
	}
	public Date getInsertedDate() {
		return InsertedDate;
	}
	public void setInsertedDate(Date insertedDate) {
		InsertedDate = insertedDate;
	}
	public Date getUpdatedDate() {
		return UpdatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		UpdatedDate = updatedDate;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	

	@Override
    public String toString() {
        String json = JsonConverter.INSTANCE.asJsonString(this);
        return json;
    }

}
