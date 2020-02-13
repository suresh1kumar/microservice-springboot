package com.mobitec.Mvoucher.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobitec.Mvoucher.dao.IFRCReportDao;
import com.mobitec.Mvoucher.domain.FRCReportBean;
import com.mobitec.Mvoucher.domain.FRCReportConsolidateBean;
import com.mobitec.Mvoucher.service.IFRCReportService;

@Service
public class FRCReportServiceImpl implements IFRCReportService{

	@Autowired
	public IFRCReportDao iFRCReportDao;
	
	@Override
	public List<FRCReportBean> getAllFRCReportDetailed(String strRegion, String strCity, String strSearchOn,
			String strFromDate, String strToDate) {
		// TODO Auto-generated method stub
		return iFRCReportDao.getAllFRCReportDetailed(strRegion, strCity, strSearchOn, strFromDate, strToDate);
	}

	@Override
	public List<FRCReportConsolidateBean> getAllFRCReportConsolidate(String strRegion, String strCity, String strSearchOn,
			String strFromDate, String strToDate) {
		// TODO Auto-generated method stub
		return iFRCReportDao.getAllFRCReportConsolidate(strRegion, strCity, strSearchOn, strFromDate, strToDate);
	}

}
