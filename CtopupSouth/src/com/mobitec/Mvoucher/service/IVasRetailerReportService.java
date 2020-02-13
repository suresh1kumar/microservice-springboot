package com.mobitec.Mvoucher.service;

import java.util.List;

import com.mobitec.Mvoucher.domain.VasRetailerContentReportBean;
import com.mobitec.Mvoucher.domain.VasRetailerReportBean;
import com.mobitec.Mvoucher.domain.VasRetailerReportDetailssailsBean;

public interface IVasRetailerReportService {
	
	public List<VasRetailerReportBean> getAllVasRetailerReportSalesSumary(String strregNam,String strcityNam,String searchOn,String strFromDate,String strToDate);
	public List<VasRetailerReportBean> getAllVasRetailerReportDealerWiseSalesSumary(String strregNam,String strcityNam,String searchOn,String strFromDate,String strToDate);
	public List<VasRetailerReportDetailssailsBean> getAllVasRetailerReportDetailedSales(String strregNam,String strcityNam,String searchOn,String strFromDate,String strToDate);
	public List<VasRetailerContentReportBean> getAllVasRetailerReportContent(String strregNam,String strcityNam,String searchOn,String strFromDate,String strToDate);
	

}
