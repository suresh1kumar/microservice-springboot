package com.mobitec.Mvoucher.service;

import java.util.List;

import com.mobitec.Mvoucher.domain.CTopUpPaymentsReceivedReportBean;

public interface ICTopUpPaymentsReceivedReportService {
	public List<CTopUpPaymentsReceivedReportBean> getAllCTOPUPaymentsReceivedReport(String strZone,String strRegion,String strSsa,String strDealer,String wichDate,String strFromDate,String strToDate);
	public List<CTopUpPaymentsReceivedReportBean> getAllCBPaymentsReceivedReport(String strZone,String strRegion,String strSsa,String strDealer,String wichDate,String strFromDate,String strToDate);


}
