package com.mobitec.Mvoucher.service;

import java.util.List;

import com.mobitec.Mvoucher.domain.MNPCommissionReportsDetailedBean;
import com.mobitec.Mvoucher.domain.MNPCommissionReportsErrorBean;
import com.mobitec.Mvoucher.domain.MNPCommissionReportsSummaryBean;

public interface IMNPCommissionReportsSummaryService {
	
	public List<MNPCommissionReportsSummaryBean> getAllMNPCommissionReportsSummary(String zone,String circle,String ssa,String msisdn,String searchBy,String searchType,String strFromDate,String strToDate,String status) ;
		
	public List<MNPCommissionReportsDetailedBean> getAllMNPCommissionReportsDetailed(String zone, String circle,
			String ssa, String msisdn, String searchBy, String searchType, String strFromDate, String strToDate,String status);

	public List<MNPCommissionReportsErrorBean> getAllMNPCommissionErrorDetailed(String zone, String circle,
			String ssa, String msisdn, String searchBy, String searchType, String strFromDate, String strToDate,String status);

}
