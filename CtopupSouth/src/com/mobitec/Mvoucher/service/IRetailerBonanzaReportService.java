package com.mobitec.Mvoucher.service;

import java.util.List;

import com.mobitec.Mvoucher.domain.RetailerBonanzaReportBean;

public interface IRetailerBonanzaReportService {
	
	public List<RetailerBonanzaReportBean> getAllRetailerBonanzaReport(String region,String city,String status,String msisdn,String strFromDate,String strToDate);

}
