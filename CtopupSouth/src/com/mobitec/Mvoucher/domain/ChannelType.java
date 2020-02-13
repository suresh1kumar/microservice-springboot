package com.mobitec.Mvoucher.domain;

public class ChannelType {
	private String req_type;
	private String REQUEST_FROM;
	
	public ChannelType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChannelType(String req_type, String rEQUEST_FROM) {
		super();
		this.req_type = req_type;
		REQUEST_FROM = rEQUEST_FROM;
	}
	public String getReq_type() {
		return req_type;
	}
	public void setReq_type(String req_type) {
		this.req_type = req_type;
	}
	public String getREQUEST_FROM() {
		return REQUEST_FROM;
	}
	public void setREQUEST_FROM(String rEQUEST_FROM) {
		REQUEST_FROM = rEQUEST_FROM;
	}
	@Override
	public String toString() {
		return "ChannelType [req_type=" + req_type + ", REQUEST_FROM=" + REQUEST_FROM + "]";
	}

	
}
