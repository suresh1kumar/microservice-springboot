package com.mobitec.Mvoucher.domain;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


	@Service
	@Scope("request")
	public class City implements Serializable {
	 private String cid;
	 private String cname;
	public City(String cid, String cname) {
		//super();
		this.cid = cid;
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "City [cid=" + cid + ", cname=" + cname + "]";
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	 
	 

}
