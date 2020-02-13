package com.mobitec.Mvoucher.domain;

import java.util.Date;

import com.mobitec.Mvoucher.jsonconv.JsonConverter;

public class ReverseRchTop3Bean {
	
	private String src_msisdn;
	private String desc_msisdn;
	private double amount;
	private double reverted;
	private double stax;
	private Date trans_date;
	private Date INS_DATE;
	private Date comp_date;
	private int t_type;
	private int remark;
	private String user_ins;
	private String user_name;
	
	public ReverseRchTop3Bean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReverseRchTop3Bean(String src_msisdn, String desc_msisdn, double amount, double reverted, double stax,
			Date trans_date, Date iNS_DATE, Date comp_date, int t_type, int remark, String user_ins, String user_name) {
		super();
		this.src_msisdn = src_msisdn;
		this.desc_msisdn = desc_msisdn;
		this.amount = amount;
		this.reverted = reverted;
		this.stax = stax;
		this.trans_date = trans_date;
		INS_DATE = iNS_DATE;
		this.comp_date = comp_date;
		this.t_type = t_type;
		this.remark = remark;
		this.user_ins = user_ins;
		this.user_name = user_name;
	}
	public String getSrc_msisdn() {
		return src_msisdn;
	}
	public void setSrc_msisdn(String src_msisdn) {
		this.src_msisdn = src_msisdn;
	}
	public String getDesc_msisdn() {
		return desc_msisdn;
	}
	public void setDesc_msisdn(String desc_msisdn) {
		this.desc_msisdn = desc_msisdn;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getReverted() {
		return reverted;
	}
	public void setReverted(double reverted) {
		this.reverted = reverted;
	}
	public double getStax() {
		return stax;
	}
	public void setStax(double stax) {
		this.stax = stax;
	}
	public Date getTrans_date() {
		return trans_date;
	}
	public void setTrans_date(Date trans_date) {
		this.trans_date = trans_date;
	}
	public Date getINS_DATE() {
		return INS_DATE;
	}
	public void setINS_DATE(Date iNS_DATE) {
		INS_DATE = iNS_DATE;
	}
	public Date getComp_date() {
		return comp_date;
	}
	public void setComp_date(Date comp_date) {
		this.comp_date = comp_date;
	}
	public int getT_type() {
		return t_type;
	}
	public void setT_type(int t_type) {
		this.t_type = t_type;
	}
	public int getRemark() {
		return remark;
	}
	public void setRemark(int remark) {
		this.remark = remark;
	}
	public String getUser_ins() {
		return user_ins;
	}
	public void setUser_ins(String user_ins) {
		this.user_ins = user_ins;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	
	@Override
    public String toString() {
        String json = JsonConverter.INSTANCE.asJsonString(this);
        return json;
    }
}
