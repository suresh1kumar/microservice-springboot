package com.mobitec.Mvoucher.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobitec.Mvoucher.dao.IMNPCommissionReportsSummaryDao;
import com.mobitec.Mvoucher.domain.MNPCommissionReportsDetailedBean;
import com.mobitec.Mvoucher.domain.MNPCommissionReportsErrorBean;
import com.mobitec.Mvoucher.domain.MNPCommissionReportsSummaryBean;
import com.mobitec.Mvoucher.service.IMNPCommissionReportsSummaryService;

@Service
public class MNPCommissionReportsSummaryServiceImpl implements IMNPCommissionReportsSummaryService{

	@Autowired
	private IMNPCommissionReportsSummaryDao iMNPCommissionReportsSummaryDao;
	@Override
	public List<MNPCommissionReportsSummaryBean> getAllMNPCommissionReportsSummary(String zone, String circle, String ssa,
			String msisdn,String searchBy, String searchType, String strFromDate, String strToDate, String status) {
		// TODO Auto-generated method stub
		return iMNPCommissionReportsSummaryDao.getAllMNPCommissionReportsSummary(zone, circle, ssa, msisdn,searchBy, searchType, strFromDate, strToDate, status);
	}
	@Override
	public List<MNPCommissionReportsDetailedBean> getAllMNPCommissionReportsDetailed(String zone, String circle,
			String ssa, String msisdn, String searchBy, String searchType, String strFromDate, String strToDate,
			String status) {
		// TODO Auto-generated method stub
		return iMNPCommissionReportsSummaryDao.getAllMNPCommissionReportsDetailed(zone, circle, ssa, msisdn, searchBy, searchType, strFromDate, strToDate, status);
	}
	@Override
	public List<MNPCommissionReportsErrorBean> getAllMNPCommissionErrorDetailed(String zone, String circle,
			String ssa, String msisdn, String searchBy, String searchType, String strFromDate, String strToDate,
			String status) {
		// TODO Auto-generated method stub
		//return iMNPCommissionReportsSummaryDao.getAllMNPCommissionErrorDetailed(zone, circle, ssa, msisdn, searchBy, searchType, strFromDate, strToDate, status);
		return iMNPCommissionReportsSummaryDao.getAllMNPCommissionReportsError(zone, circle, ssa, msisdn, searchBy, searchType, strFromDate, strToDate, status);
	}

}
