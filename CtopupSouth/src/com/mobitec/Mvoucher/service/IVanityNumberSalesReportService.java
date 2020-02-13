package com.mobitec.Mvoucher.service;

import java.util.List;

import com.mobitec.Mvoucher.domain.VanityNumberSalesReportBean;

public interface IVanityNumberSalesReportService {
	public List<VanityNumberSalesReportBean> getAllVanityNumberSalesReports(String region, String city, String mobile,
			String fromDate, String toDate);

}
