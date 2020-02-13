package com.mobitec.Mvoucher.domain;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


	@Service
	@Scope("request")
	public class Zone implements Serializable{
	 private String zid;
	 private String zname;
	public Zone(String zid, String zname) {
		//super();
		this.zid = zid;
		this.zname = zname;
	}
	public String getZid() {
		return zid;
	}
	public void setZid(String zid) {
		this.zid = zid;
	}
	public String getZname() {
		return zname;
	}
	public void setZname(String zname) {
		this.zname = zname;
	}
	@Override
	public String toString() {
		return "Country [zid=" + zid + ", zname=" + zname + "]";
	}
	
	 
	 
}
