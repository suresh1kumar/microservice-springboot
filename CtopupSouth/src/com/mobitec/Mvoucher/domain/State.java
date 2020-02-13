package com.mobitec.Mvoucher.domain;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("request")
public class State implements Serializable {
 private String sid;
 private String sname;
public State(String sid, String sname) {
	//super();
	this.sid = sid;
	this.sname = sname;
}
public String getSid() {
	return sid;
}
public void setSid(String sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
@Override
public String toString() {
	return "State [sid=" + sid + ", sname=" + sname + "]";
}
 
 

  
        
}