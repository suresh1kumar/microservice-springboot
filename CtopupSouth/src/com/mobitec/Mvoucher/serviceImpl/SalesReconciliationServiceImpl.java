package com.mobitec.Mvoucher.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobitec.Mvoucher.dao.ISalesReconciliationDao;
import com.mobitec.Mvoucher.domain.SalesReconciliationBean;
import com.mobitec.Mvoucher.service.ISalesReconciliationService;

@Service
public class SalesReconciliationServiceImpl implements ISalesReconciliationService{

	@Autowired
	public ISalesReconciliationDao iSalesReconciliationDao;
	@Override
	public List<SalesReconciliationBean> getSalesReconciliationReport(String zone, String circle, String city,
			String walletName, String strFromDate, String strToDate) {
		// TODO Auto-generated method stub
		return iSalesReconciliationDao.getSalesReconciliationReport(zone, circle, city, walletName, strFromDate, strToDate);
	}

}
