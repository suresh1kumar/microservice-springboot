package com.mobitec.Mvoucher.service;

import java.util.List;

import com.mobitec.Mvoucher.domain.BulkRechargeReportBean;

public interface IBulkRechargeReportService {
	
	public List<BulkRechargeReportBean> getAllBulkRechargeReport(String status,String msisdn, String fdate, String tdate);
	

}
