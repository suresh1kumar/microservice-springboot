package com.mobitec.Mvoucher.service;

import java.util.List;

import com.mobitec.Mvoucher.domain.StockCancellationReportBean;

public interface IStockCancellationReportService {
	
public List<StockCancellationReportBean> getAllStockCancellationReport(String wallet,String wichDate, String srcNumbOrIdOptn, String srcNumberOrId,
			
			String SearchOn, String strFromDate, String strToDate);		
			

}
