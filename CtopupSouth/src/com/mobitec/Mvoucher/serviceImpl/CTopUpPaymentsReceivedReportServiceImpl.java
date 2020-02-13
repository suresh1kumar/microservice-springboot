package com.mobitec.Mvoucher.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobitec.Mvoucher.dao.ICTopUpPaymentsReceivedReportDao;
import com.mobitec.Mvoucher.domain.CTopUpPaymentsReceivedReportBean;
import com.mobitec.Mvoucher.service.ICTopUpPaymentsReceivedReportService;

@Service
public class CTopUpPaymentsReceivedReportServiceImpl implements ICTopUpPaymentsReceivedReportService{

	@Autowired
	public ICTopUpPaymentsReceivedReportDao ICTopUpPaymentsReceivedReportDao;
	@Override
	public List<CTopUpPaymentsReceivedReportBean> getAllCTOPUPaymentsReceivedReport(String strZone, String strRegion,
			String strSsa, String strDealer, String wichDate, String strFromDate, String strToDate) {
		// TODO Auto-generated method stub
		return ICTopUpPaymentsReceivedReportDao.getAllCTOPUPaymentsReceivedReport(strZone, strRegion, strSsa, strDealer, wichDate, strFromDate, strToDate);
	}

	@Override
	public List<CTopUpPaymentsReceivedReportBean> getAllCBPaymentsReceivedReport(String strZone, String strRegion,
			String strSsa, String strDealer, String wichDate, String strFromDate, String strToDate) {
		// TODO Auto-generated method stub
		return ICTopUpPaymentsReceivedReportDao.getAllCBPaymentsReceivedReport(strZone, strRegion, strSsa, strDealer, wichDate, strFromDate, strToDate);
	}

}
