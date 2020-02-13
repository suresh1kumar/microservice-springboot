package com.mobitec.Mvoucher.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobitec.Mvoucher.dao.IUnifiedSimSalesReportDao;
import com.mobitec.Mvoucher.domain.UnifiedSimSalesReportBean;
import com.mobitec.Mvoucher.service.IUnifiedSimSalesReportService;

@Service
public class UnifiedSimSalesReportServiceImpl implements IUnifiedSimSalesReportService{

	@Autowired
	public IUnifiedSimSalesReportDao iUnifiedSimSalesReportDao;
	
	@Override
	public List<UnifiedSimSalesReportBean> getAllUnifiedSimSalesReport(String status, String searchBy, String msisdn,
			String strFromDate, String strToDate) {
		// TODO Auto-generated method stub
		return iUnifiedSimSalesReportDao.getAllUnifiedSimSalesReport(status, searchBy, msisdn, strFromDate, strToDate);
	}

}
