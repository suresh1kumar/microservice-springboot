package com.mobitec.Mvoucher.domain;

import java.util.Date;

import com.mobitec.Mvoucher.jsonconv.JsonConverter;

public class ChannelWiseBean {
	
     
     private Date create_stmt;
     private String circlename;
	  private String cityname;
	  private String sourcemsisdn;
	  private String descmsisdn;
	  private int amount;
	  private String transaction_type;
	 
	  private String status;
	  private Double source_balance_before;
	  private Double source_balance_after;
	 
	  private Double dest__balance_before;
	  private Double dest__balance_after;
	  
	  private String Source_circlename;
	  
	  
	  
	public ChannelWiseBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	public Date getCreate_stmt() {
		return create_stmt;
	}



	public void setCreate_stmt(Date create_stmt) {
		this.create_stmt = create_stmt;
	}



	public String getCirclename() {
		return circlename;
	}



	public void setCirclename(String circlename) {
		this.circlename = circlename;
	}



	public String getCityname() {
		return cityname;
	}



	public void setCityname(String cityname) {
		this.cityname = cityname;
	}



	public String getSourcemsisdn() {
		return sourcemsisdn;
	}



	public void setSourcemsisdn(String sourcemsisdn) {
		this.sourcemsisdn = sourcemsisdn;
	}



	public String getDescmsisdn() {
		return descmsisdn;
	}



	public void setDescmsisdn(String descmsisdn) {
		this.descmsisdn = descmsisdn;
	}



	public int getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}



	public String getTransaction_type() {
		return transaction_type;
	}



	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public Double getSource_balance_before() {
		return source_balance_before;
	}



	public void setSource_balance_before(Double source_balance_before) {
		this.source_balance_before = source_balance_before;
	}



	public Double getSource_balance_after() {
		return source_balance_after;
	}



	public void setSource_balance_after(Double source_balance_after) {
		this.source_balance_after = source_balance_after;
	}



	public Double getDest__balance_before() {
		return dest__balance_before;
	}



	public void setDest__balance_before(Double dest__balance_before) {
		this.dest__balance_before = dest__balance_before;
	}



	public Double getDest__balance_after() {
		return dest__balance_after;
	}



	public void setDest__balance_after(Double dest__balance_after) {
		this.dest__balance_after = dest__balance_after;
	}



	public String getSource_circlename() {
		return Source_circlename;
	}



	public void setSource_circlename(String source_circlename) {
		Source_circlename = source_circlename;
	}



	public ChannelWiseBean(Date create_stmt, String circlename, String cityname, String sourcemsisdn, String descmsisdn,
			int amount, String transaction_type, String status, Double source_balance_before,
			Double source_balance_after, Double dest__balance_before, Double dest__balance_after,
			String source_circlename) {
		super();
		this.create_stmt = create_stmt;
		this.circlename = circlename;
		this.cityname = cityname;
		this.sourcemsisdn = sourcemsisdn;
		this.descmsisdn = descmsisdn;
		this.amount = amount;
		this.transaction_type = transaction_type;
		this.status = status;
		this.source_balance_before = source_balance_before;
		this.source_balance_after = source_balance_after;
		this.dest__balance_before = dest__balance_before;
		this.dest__balance_after = dest__balance_after;
		Source_circlename = source_circlename;
	}



	@Override
    public String toString() {
        String json = JsonConverter.INSTANCE.asJsonString(this);
        return json;
    }
	
	
	

}
