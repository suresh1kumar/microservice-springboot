package com.mobitec.Mvoucher.service;

import java.util.List;

import com.mobitec.Mvoucher.domain.CancelledTransactionBean;

public interface ICancelledTransactionReportService {
	
	public List<CancelledTransactionBean> getAllTransactionDateReport(String SearchOn, String strFromDate,
			String strToDate);

}
