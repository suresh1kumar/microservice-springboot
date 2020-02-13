package com.mobitec.Mvoucher.dao;

import java.util.List;

import com.mobitec.Mvoucher.domain.CanceledMovedStkReportBean;

public interface ICanceledMovedStkReportDao {
	
	public List<CanceledMovedStkReportBean> getAllCanceledMovedStkReport(String wallet,String srcNumbOrIdOptn, String srcNumberOrId,
			String destMobileNumber, String fromDate, String toDate);

}
