package com.mobitec.Mvoucher.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobitec.Mvoucher.dao.IRetailerBonanzaReportDao;
import com.mobitec.Mvoucher.domain.RetailerBonanzaReportBean;
import com.mobitec.Mvoucher.service.IRetailerBonanzaReportService;

@Service
public class RetailerBonanzaReportServiceImpl implements IRetailerBonanzaReportService{

	@Autowired
	public IRetailerBonanzaReportDao retailerBonanzaReportDao;
	@Override
	public List<RetailerBonanzaReportBean> getAllRetailerBonanzaReport(String region,String city,String status,String msisdn,String strFromDate,String strToDate) {
		// TODO Auto-generated method stub
		return retailerBonanzaReportDao.getAllRetailerBonanzaReport(region, city, status, msisdn, strFromDate, strToDate);
	}

}
