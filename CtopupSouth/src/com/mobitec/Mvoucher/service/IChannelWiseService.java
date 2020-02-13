package com.mobitec.Mvoucher.service;

import java.util.List;

import com.mobitec.Mvoucher.domain.ChannelWiseBean;


public interface IChannelWiseService {
	//public List<Student> getStudent(String name,String dep,String zname,String sname,String cname,String DEPART,String RETURN);
	public List<ChannelWiseBean> getAllChannelWiseReport(String status, String req_type, String dest_circle_id, String DEST_ZONE_ID, String wichDate, String strFromDate, String strToDate ,String cityid);

}
