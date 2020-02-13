package com.mobitec.Mvoucher.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobitec.Mvoucher.dao.ICanceledMovedStkReportDao;
import com.mobitec.Mvoucher.domain.CanceledMovedStkReportBean;
import com.mobitec.Mvoucher.service.ICanceledMovedStkReportService;

@Service
public class CanceledMovedStkReportServiceImpl implements ICanceledMovedStkReportService{

	@Autowired
	private ICanceledMovedStkReportDao canceledMovedStkReportDao;
	
	@Override
	public List<CanceledMovedStkReportBean> getAllCanceledMovedStkReport(String wallet,String srcNumbOrIdOptn, String srcNumberOrId,
			String destMobileNumber, String fromDate, String toDate) {
		// TODO Auto-generated method stub
		return canceledMovedStkReportDao.getAllCanceledMovedStkReport(wallet,srcNumbOrIdOptn, srcNumberOrId, destMobileNumber, fromDate, toDate);
	}

}
