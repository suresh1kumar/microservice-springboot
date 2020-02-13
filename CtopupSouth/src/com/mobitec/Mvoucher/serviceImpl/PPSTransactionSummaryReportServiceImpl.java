package com.mobitec.Mvoucher.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobitec.Mvoucher.dao.IPPSTransactionSummaryReportDao;
import com.mobitec.Mvoucher.domain.PPSTransactionSummaryReportBean;
import com.mobitec.Mvoucher.service.IPPSTransactionSummaryReportService;

@Service
public class PPSTransactionSummaryReportServiceImpl implements IPPSTransactionSummaryReportService{

	@Autowired
	public IPPSTransactionSummaryReportDao iPPSTransactionSummaryReportDao;
	
	@Override
	public List<PPSTransactionSummaryReportBean> getAllPPSTransactionSummaryReport(String strFromDate,
			String strToDate) {
		// TODO Auto-generated method stub
		return iPPSTransactionSummaryReportDao.getAllPPSTransactionSummaryReport(strFromDate, strToDate);
	}
	
	
	// i am not use both method altter i will use..
	@Override
	public List<PPSTransactionSummaryReportBean> getAllPPSTransactionSummaryReportCount(String strFromDate,
			String strToDate) {
		// TODO Auto-generated method stub
		return iPPSTransactionSummaryReportDao.getAllPPSTransactionSummaryReportCount(strFromDate, strToDate);
	}

	@Override
	public List<PPSTransactionSummaryReportBean> getAllPPSTransactionSummaryReportAmount(String strFromDate,
			String strToDate) {
		// TODO Auto-generated method stub
		return iPPSTransactionSummaryReportDao.getAllPPSTransactionSummaryReportAmount(strFromDate, strToDate);
	}

}
