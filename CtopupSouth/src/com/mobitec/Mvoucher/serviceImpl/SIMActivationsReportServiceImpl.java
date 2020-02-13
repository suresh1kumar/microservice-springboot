package com.mobitec.Mvoucher.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobitec.Mvoucher.dao.ISIMActivationsReportDao;
import com.mobitec.Mvoucher.domain.SIMActivationsReportBean;
import com.mobitec.Mvoucher.service.ISIMActivationsReportService;

@Service
public class SIMActivationsReportServiceImpl implements ISIMActivationsReportService{

	@Autowired
	public ISIMActivationsReportDao iSIMActivationsReportDao;
	@Override
	public List<SIMActivationsReportBean> getAllSIMActivationsReport(String circleid, String cityid, String strFromDate,
			String strToDate) {
		// TODO Auto-generated method stub
		return iSIMActivationsReportDao.getAllSIMActivationsReport(circleid, cityid, strFromDate, strToDate);
	}

}
