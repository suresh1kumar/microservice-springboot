package com.mobitec.Mvoucher.service;

import java.util.List;

import com.mobitec.Mvoucher.domain.CanceledMovedStkReportBean;

public interface ICanceledMovedStkReportService {
	
	public List<CanceledMovedStkReportBean> getAllCanceledMovedStkReport(String wallet,String srcNumbOrIdOptn, String srcNumberOrId,
			String destMobileNumber, String fromDate, String toDate);
	                                                                   


}
