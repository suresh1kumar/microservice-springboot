package com.mobitec.Mvoucher.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobitec.Mvoucher.dao.ICancelledTransactionReportDao;
import com.mobitec.Mvoucher.domain.CancelledTransactionBean;
import com.mobitec.Mvoucher.service.ICancelledTransactionReportService;

@Service
public class CancelledTransactionReportServiceImpl implements ICancelledTransactionReportService{

	@Autowired
	public ICancelledTransactionReportDao cancelledTransactionReportDao;
	
	@Override
	public List<CancelledTransactionBean> getAllTransactionDateReport(String SearchOn, String strFromDate,
			String strToDate) {
		// TODO Auto-generated method stub
		return cancelledTransactionReportDao.getAllTransactionDateReport(SearchOn, strFromDate, strToDate);
	}

}
