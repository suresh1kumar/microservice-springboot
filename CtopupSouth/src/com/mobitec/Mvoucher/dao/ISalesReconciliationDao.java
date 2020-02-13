package com.mobitec.Mvoucher.dao;

import java.util.List;

import com.mobitec.Mvoucher.domain.SalesReconciliationBean;

public interface ISalesReconciliationDao {
	
	public List<SalesReconciliationBean> getSalesReconciliationReport(String zone, String circle,String city,String walletName,String strFromDate, String strToDate);


}
