package com.mobitec.Mvoucher.service;

import java.util.List;

import com.mobitec.Mvoucher.domain.PPSTransactionSummaryReportBean;

public interface IPPSTransactionSummaryReportService {
	
	public List<PPSTransactionSummaryReportBean> getAllPPSTransactionSummaryReport(String strFromDate,
			String strToDate);
	
	// i am not use both method altter i will use..
	public List<PPSTransactionSummaryReportBean> getAllPPSTransactionSummaryReportCount(String strFromDate,String strToDate);;
	public List<PPSTransactionSummaryReportBean> getAllPPSTransactionSummaryReportAmount(String strFromDate,String strToDate);;
	

}
