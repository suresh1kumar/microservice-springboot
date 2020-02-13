package com.mobitec.Mvoucher.domain;

import java.util.Date;

import com.mobitec.Mvoucher.jsonconv.JsonConverter;

public class SalesReconciliationBean {
	
	private Date datetime;
	private String circle;
	private String ssa;
	private int dealer_id;
	private String dealer_code;
	private String dealer_name;
	private String dealer_number;
	private int opening_balance;
	private int closing_balance;
	private int stock_allocated;
	private int stock_moved_in;
	private int stock_moved_out;
	private int recharge_topup_sale;
	private int diff;
	private int cancel_amount;
	private int stock_allocated_canceled;
	private int stock_moved_in_canceled;
	private int stock_moved_out_canceled;
	private int sale_canceled;
	public SalesReconciliationBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SalesReconciliationBean(Date datetime, String circle, String ssa, int dealer_id, String dealer_code,
			String dealer_name, String dealer_number, int opening_balance, int closing_balance, int stock_allocated,
			int stock_moved_in, int stock_moved_out, int recharge_topup_sale, int diff, int cancel_amount,
			int stock_allocated_canceled, int stock_moved_in_canceled, int stock_moved_out_canceled,
			int sale_canceled) {
		super();
		this.datetime = datetime;
		this.circle = circle;
		this.ssa = ssa;
		this.dealer_id = dealer_id;
		this.dealer_code = dealer_code;
		this.dealer_name = dealer_name;
		this.dealer_number = dealer_number;
		this.opening_balance = opening_balance;
		this.closing_balance = closing_balance;
		this.stock_allocated = stock_allocated;
		this.stock_moved_in = stock_moved_in;
		this.stock_moved_out = stock_moved_out;
		this.recharge_topup_sale = recharge_topup_sale;
		this.diff = diff;
		this.cancel_amount = cancel_amount;
		this.stock_allocated_canceled = stock_allocated_canceled;
		this.stock_moved_in_canceled = stock_moved_in_canceled;
		this.stock_moved_out_canceled = stock_moved_out_canceled;
		this.sale_canceled = sale_canceled;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public String getCircle() {
		return circle;
	}
	public void setCircle(String circle) {
		this.circle = circle;
	}
	public String getSsa() {
		return ssa;
	}
	public void setSsa(String ssa) {
		this.ssa = ssa;
	}
	public int getDealer_id() {
		return dealer_id;
	}
	public void setDealer_id(int dealer_id) {
		this.dealer_id = dealer_id;
	}
	public String getDealer_code() {
		return dealer_code;
	}
	public void setDealer_code(String dealer_code) {
		this.dealer_code = dealer_code;
	}
	public String getDealer_name() {
		return dealer_name;
	}
	public void setDealer_name(String dealer_name) {
		this.dealer_name = dealer_name;
	}
	public String getDealer_number() {
		return dealer_number;
	}
	public void setDealer_number(String dealer_number) {
		this.dealer_number = dealer_number;
	}
	public int getOpening_balance() {
		return opening_balance;
	}
	public void setOpening_balance(int opening_balance) {
		this.opening_balance = opening_balance;
	}
	public int getClosing_balance() {
		return closing_balance;
	}
	public void setClosing_balance(int closing_balance) {
		this.closing_balance = closing_balance;
	}
	public int getStock_allocated() {
		return stock_allocated;
	}
	public void setStock_allocated(int stock_allocated) {
		this.stock_allocated = stock_allocated;
	}
	public int getStock_moved_in() {
		return stock_moved_in;
	}
	public void setStock_moved_in(int stock_moved_in) {
		this.stock_moved_in = stock_moved_in;
	}
	public int getStock_moved_out() {
		return stock_moved_out;
	}
	public void setStock_moved_out(int stock_moved_out) {
		this.stock_moved_out = stock_moved_out;
	}
	public int getRecharge_topup_sale() {
		return recharge_topup_sale;
	}
	public void setRecharge_topup_sale(int recharge_topup_sale) {
		this.recharge_topup_sale = recharge_topup_sale;
	}
	public int getDiff() {
		return diff;
	}
	public void setDiff(int diff) {
		this.diff = diff;
	}
	public int getCancel_amount() {
		return cancel_amount;
	}
	public void setCancel_amount(int cancel_amount) {
		this.cancel_amount = cancel_amount;
	}
	public int getStock_allocated_canceled() {
		return stock_allocated_canceled;
	}
	public void setStock_allocated_canceled(int stock_allocated_canceled) {
		this.stock_allocated_canceled = stock_allocated_canceled;
	}
	public int getStock_moved_in_canceled() {
		return stock_moved_in_canceled;
	}
	public void setStock_moved_in_canceled(int stock_moved_in_canceled) {
		this.stock_moved_in_canceled = stock_moved_in_canceled;
	}
	public int getStock_moved_out_canceled() {
		return stock_moved_out_canceled;
	}
	public void setStock_moved_out_canceled(int stock_moved_out_canceled) {
		this.stock_moved_out_canceled = stock_moved_out_canceled;
	}
	public int getSale_canceled() {
		return sale_canceled;
	}
	public void setSale_canceled(int sale_canceled) {
		this.sale_canceled = sale_canceled;
	}
	
	
	

	@Override
    public String toString() {
        String json = JsonConverter.INSTANCE.asJsonString(this);
        return json;
    }
	
	

}
