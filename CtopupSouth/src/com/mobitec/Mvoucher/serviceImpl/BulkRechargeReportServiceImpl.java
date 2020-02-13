package com.mobitec.Mvoucher.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobitec.Mvoucher.dao.IBulkRechargeReportDao;
import com.mobitec.Mvoucher.domain.BulkRechargeReportBean;
import com.mobitec.Mvoucher.service.IBulkRechargeReportService;

@Service
public class BulkRechargeReportServiceImpl implements IBulkRechargeReportService{

	@Autowired
	public IBulkRechargeReportDao iBulkRechargeReportDao;
	@Override
	public List<BulkRechargeReportBean> getAllBulkRechargeReport(String status, String msisdn, String fdate,
			String tdate) {
		// TODO Auto-generated method stub
		return iBulkRechargeReportDao.getAllBulkRechargeReport(status, msisdn, fdate, tdate);
	}

}
