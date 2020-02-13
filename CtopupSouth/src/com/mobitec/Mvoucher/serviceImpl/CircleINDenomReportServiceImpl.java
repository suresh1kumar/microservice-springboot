package com.mobitec.Mvoucher.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobitec.Mvoucher.dao.ICircleINDenomReportDao;
import com.mobitec.Mvoucher.domain.CircleINDenomReportBean;
import com.mobitec.Mvoucher.service.ICircleINDenomReportService;

@Service
public class CircleINDenomReportServiceImpl implements ICircleINDenomReportService{

	@Autowired
	private ICircleINDenomReportDao circleINDenomReportDao;
	
	@Override
	public List<CircleINDenomReportBean> getAllDenominationwiseSalesReport(String circleid, String inid,
			String strFromDate, String strToDate) {
		// TODO Auto-generated method stub
		return circleINDenomReportDao.getAllDenominationwiseSalesReport(circleid, inid, strFromDate, strToDate);
	}

}
