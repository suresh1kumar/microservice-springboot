package com.mobitec.Mvoucher.dao;

import java.util.List;

import com.mobitec.Mvoucher.domain.CancelledTransactionBean;

public interface ICancelledTransactionReportDao {
	
	public List<CancelledTransactionBean> getAllTransactionDateReport(String SearchOn,String strFromDate,String strToDate);

}
