package com.mobitec.Mvoucher.dao;

import java.util.List;

import com.mobitec.Mvoucher.domain.RetailerBonanzaReportBean;

public interface IRetailerBonanzaReportDao {
	
	public List<RetailerBonanzaReportBean> getAllRetailerBonanzaReport(String region,String city,String status,String msisdn,String strFromDate,String strToDate);

}
                                                                         