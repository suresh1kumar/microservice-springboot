package com.mobitec.Mvoucher.dao;

import java.util.List;

import com.mobitec.Mvoucher.domain.MNPCommissionReportsDetailedBean;
import com.mobitec.Mvoucher.domain.MNPCommissionReportsErrorBean;
import com.mobitec.Mvoucher.domain.MNPCommissionReportsSummaryBean;

public interface IMNPCommissionReportsSummaryDao {
	
	public List<MNPCommissionReportsSummaryBean> getAllMNPCommissionReportsSummary(String zone,String circle,String ssa,String msisdn,String searchBy,String searchType,String strFromDate,String strToDate,String status);
	public List<MNPCommissionReportsDetailedBean> getAllMNPCommissionReportsDetailed(String zone,String circle,String ssa,String msisdn,String searchBy,String searchType,String strFromDate,String strToDate,String status);
	
	public List<MNPCommissionReportsErrorBean> getAllMNPCommissionReportsError(String zone,String circle,String ssa,String msisdn,String searchBy,String searchType,String strFromDate,String strToDate,String status);
	
}
//String zone,String circle,String ssa,String msisdn,String searchType,String strFromDate,String strToDate,String status,

