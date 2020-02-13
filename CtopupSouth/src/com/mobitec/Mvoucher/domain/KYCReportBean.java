package com.mobitec.Mvoucher.domain;

import java.util.Date;

import com.mobitec.Mvoucher.jsonconv.JsonConverter;


public class KYCReportBean {
	
	private int TRANSACTIONID;	
	private String source_msisdn; 	
	private String dmsisdn ;	
	private int denomination;	
	private Date TRANSDATE;	
	private String FAILURE_REASON ;	
	private String subscriber_circle;
	private int BAL_BEFORE;	
	private int BAL_AFTER; 	
	private int status;
	
	public KYCReportBean() {
		super();
		
	}
	public KYCReportBean(int tRANSACTIONID, String source_msisdn, String dmsisdn, int denomination, Date tRANSDATE,
			String fAILURE_REASON, String subscriber_circle, int bAL_BEFORE, int bAL_AFTER, int status) {
		super();
		TRANSACTIONID = tRANSACTIONID;
		this.source_msisdn = source_msisdn;
		this.dmsisdn = dmsisdn;
		this.denomination = denomination;
		TRANSDATE = tRANSDATE;
		FAILURE_REASON = fAILURE_REASON;
		this.subscriber_circle = subscriber_circle;
		BAL_BEFORE = bAL_BEFORE;
		BAL_AFTER = bAL_AFTER;
		this.status = status;
	}
	public int getTRANSACTIONID() {
		return TRANSACTIONID;
	}
	public void setTRANSACTIONID(int tRANSACTIONID) {
		TRANSACTIONID = tRANSACTIONID;
	}
	public String getSource_msisdn() {
		return source_msisdn;
	}
	public void setSource_msisdn(String source_msisdn) {
		this.source_msisdn = source_msisdn;
	}
	public String getDmsisdn() {
		return dmsisdn;
	}
	public void setDmsisdn(String dmsisdn) {
		this.dmsisdn = dmsisdn;
	}
	public int getDenomination() {
		return denomination;
	}
	public void setDenomination(int denomination) {
		this.denomination = denomination;
	}
	public Date getTRANSDATE() {
		return TRANSDATE;
	}
	public void setTRANSDATE(Date tRANSDATE) {
		TRANSDATE = tRANSDATE;
	}
	public String getFAILURE_REASON() {
		return FAILURE_REASON;
	}
	public void setFAILURE_REASON(String fAILURE_REASON) {
		FAILURE_REASON = fAILURE_REASON;
	}
	public String getSubscriber_circle() {
		return subscriber_circle;
	}
	public void setSubscriber_circle(String subscriber_circle) {
		this.subscriber_circle = subscriber_circle;
	}
	public int getBAL_BEFORE() {
		return BAL_BEFORE;
	}
	public void setBAL_BEFORE(int bAL_BEFORE) {
		BAL_BEFORE = bAL_BEFORE;
	}
	public int getBAL_AFTER() {
		return BAL_AFTER;
	}
	public void setBAL_AFTER(int bAL_AFTER) {
		BAL_AFTER = bAL_AFTER;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	@Override
    public String toString() {
        String json = JsonConverter.INSTANCE.asJsonString(this);
        return json;
    }
	

}
