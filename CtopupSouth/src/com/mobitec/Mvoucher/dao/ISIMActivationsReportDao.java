package com.mobitec.Mvoucher.dao;

import java.util.List;

import com.mobitec.Mvoucher.domain.SIMActivationsReportBean;

public interface ISIMActivationsReportDao {
	
	public List<SIMActivationsReportBean> getAllSIMActivationsReport(String circleid,String cityid,String strFromDate,String strToDate);
	

}
