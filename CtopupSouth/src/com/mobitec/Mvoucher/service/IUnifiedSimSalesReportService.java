package com.mobitec.Mvoucher.service;

import java.util.List;

import com.mobitec.Mvoucher.domain.UnifiedSimSalesReportBean;

public interface IUnifiedSimSalesReportService {
	
	public List<UnifiedSimSalesReportBean> getAllUnifiedSimSalesReport(String status,String searchBy,String msisdn, String strFromDate,String strToDate);
	

}
