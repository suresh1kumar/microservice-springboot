package com.mobitec.Mvoucher.service;

import java.util.List;

import com.mobitec.Mvoucher.domain.CircleINDenomReportBean;

public interface ICircleINDenomReportService {
	
	public List<CircleINDenomReportBean> getAllDenominationwiseSalesReport(String circleid, String inid,
			String strFromDate, String strToDate);

}
