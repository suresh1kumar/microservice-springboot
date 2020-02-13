package com.mobitec.Mvoucher.dao;

import java.util.List;

import com.mobitec.Mvoucher.domain.BulkRechargeReportBean;

public interface IBulkRechargeReportDao {
	public List<BulkRechargeReportBean> getAllBulkRechargeReport(String status,String msisdn, String fdate, String tdate);
	

}
