package com.mobitec.Mvoucher.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobitec.Mvoucher.dao.IVanityNumberSalesReportDao;
import com.mobitec.Mvoucher.domain.VanityNumberSalesReportBean;
import com.mobitec.Mvoucher.service.IVanityNumberSalesReportService;

@Service
public class VanityNumberSalesReportServiceImpl implements IVanityNumberSalesReportService{

	@Autowired
	private IVanityNumberSalesReportDao vanityNumberSalesReportDao;
	@Override
	public List<VanityNumberSalesReportBean> getAllVanityNumberSalesReports(String region, String city, String mobile,
			String fromDate, String toDate) {
		// TODO Auto-generated method stub
		return vanityNumberSalesReportDao.getAllVanityNumberSalesReports(region, city, mobile, fromDate, toDate);
	}

}
