package com.mobitec.Mvoucher.service;

import java.util.List;

import com.mobitec.Mvoucher.domain.SalesReconciliationBean;

public interface ISalesReconciliationService {
	
	public List<SalesReconciliationBean> getSalesReconciliationReport(String zone, String circle, String city,
			String walletName, String strFromDate, String strToDate);

}
