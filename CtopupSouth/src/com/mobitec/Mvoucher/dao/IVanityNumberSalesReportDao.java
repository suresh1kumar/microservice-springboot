package com.mobitec.Mvoucher.dao;

import java.util.List;

import com.mobitec.Mvoucher.domain.VanityNumberSalesReportBean;

public interface IVanityNumberSalesReportDao {
	public List<VanityNumberSalesReportBean> getAllVanityNumberSalesReports( String region, String city,String mobile, String fromDate, String toDate);
	

}
