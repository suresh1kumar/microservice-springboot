package com.mobitec.Mvoucher.service;

import java.util.List;

import com.mobitec.Mvoucher.domain.SIMActivationsReportBean;

public interface ISIMActivationsReportService {
	
	public List<SIMActivationsReportBean> getAllSIMActivationsReport(String circleid, String cityid, String strFromDate,
			String strToDate);

}
