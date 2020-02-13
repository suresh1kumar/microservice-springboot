package com.mobitec.Mvoucher.dao;

import java.util.List;

import com.mobitec.Mvoucher.domain.UnifiedSimSalesReportBean;

public interface IUnifiedSimSalesReportDao {
	
	public List<UnifiedSimSalesReportBean> getAllUnifiedSimSalesReport(String status,String searchBy,String msisdn, String strFromDate,String strToDate);
	

}
