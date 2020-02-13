package com.mobitec.Mvoucher.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobitec.Mvoucher.dao.IVasRetailerReportDao;
import com.mobitec.Mvoucher.domain.VasRetailerContentReportBean;
import com.mobitec.Mvoucher.domain.VasRetailerReportBean;
import com.mobitec.Mvoucher.domain.VasRetailerReportDetailssailsBean;
import com.mobitec.Mvoucher.service.IVasRetailerReportService;

@Service
public class VasRetailerReportServiceImpl implements IVasRetailerReportService{

	@Autowired
	public IVasRetailerReportDao iVasRetailerReportDao;
	
	@Override
	public List<VasRetailerReportBean> getAllVasRetailerReportSalesSumary(String strregNam, String strcityNam,
			String searchOn,String strFromDate, String strToDate) {
		// TODO Auto-generated method stub
		return iVasRetailerReportDao.getAllVasRetailerReportSalesSumary(strregNam, strcityNam, searchOn, strFromDate, strToDate);
	}

	@Override
	public List<VasRetailerReportBean> getAllVasRetailerReportDealerWiseSalesSumary(String strregNam, String strcityNam,
			String searchOn,String strFromDate, String strToDate) {
		// TODO Auto-generated method stub
		return iVasRetailerReportDao.getAllVasRetailerReportDealerWiseSalesSumary(strregNam, strcityNam,searchOn, strFromDate, strToDate);
	}

	@Override
	public List<VasRetailerReportDetailssailsBean> getAllVasRetailerReportDetailedSales(String strregNam, String strcityNam,
			String searchOn,String strFromDate, String strToDate) {
		// TODO Auto-generated method stub
		return iVasRetailerReportDao.getAllVasRetailerReportDetailedSales(strregNam, strcityNam,searchOn, strFromDate, strToDate);
	}

	@Override
	public List<VasRetailerContentReportBean> getAllVasRetailerReportContent(String strregNam, String strcityNam,
			String searchOn,String strFromDate, String strToDate) {
		// TODO Auto-generated method stub
		return iVasRetailerReportDao.getAllVasRetailerReportContent(strregNam, strcityNam, searchOn,strFromDate, strToDate);
	}

}
