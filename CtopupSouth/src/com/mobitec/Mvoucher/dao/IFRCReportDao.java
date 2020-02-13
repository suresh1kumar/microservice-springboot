package com.mobitec.Mvoucher.dao;

import java.util.List;

import com.mobitec.Mvoucher.domain.FRCReportBean;
import com.mobitec.Mvoucher.domain.FRCReportConsolidateBean;

public interface IFRCReportDao {
	
	public List<FRCReportBean> getAllFRCReportDetailed(String strRegion, String strCity,String strSearchOn, String strFromDate, String strToDate);
	
	public List<FRCReportConsolidateBean> getAllFRCReportConsolidate(String strRegion, String strCity,String strSearchOn, String strFromDate, String strToDate);
	
	//(String strRegion, String strCity,String strSearchOn, String strFromDate, String strToDate)
}
