package com.mobitec.Mvoucher.service;

import java.util.List;

import com.mobitec.Mvoucher.domain.KYCReportBean;
import com.mobitec.Mvoucher.domain.KYCReportBean2;

public interface IKYCReportService {

	//public List<KYCReportBean> getKycReport(String region, String msisdn, String fdate, String tdate, String reportType);
	public List<KYCReportBean> getDetailedReport(String Region, String City,String msisdn, String fdate, String tdate, String ReportType);
	public List<KYCReportBean2> getSummaryReport(String Region, String City,String msisdn, String fdate, String tdate, String ReportType);
}
