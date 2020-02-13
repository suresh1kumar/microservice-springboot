package com.mobitec.Mvoucher.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobitec.Mvoucher.dao.IKYCReportDao;
import com.mobitec.Mvoucher.domain.KYCReportBean;
import com.mobitec.Mvoucher.domain.KYCReportBean2;
import com.mobitec.Mvoucher.service.IKYCReportService;

@Service
public class KYCReportServiceImpl implements IKYCReportService{
	@Autowired
	private IKYCReportDao kYCReportDao;
	
	@Override
	public List<KYCReportBean> getDetailedReport(String Region, String City, String msisdn, String fdate, String tdate,
			String ReportType) {
		// TODO Auto-generated method stub
		return kYCReportDao.getDetailedReport(Region, City, msisdn, fdate, tdate, ReportType);
	}
	@Override
	public List<KYCReportBean2> getSummaryReport(String Region, String City, String msisdn, String fdate, String tdate,
			String ReportType) {
		// TODO Auto-generated method stub
		return kYCReportDao.getSummaryReport(Region, City, msisdn, fdate, tdate, ReportType);
	}

}
