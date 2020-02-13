package com.mobitec.Mvoucher.dao;

import java.util.List;

import com.mobitec.Mvoucher.domain.CircleINDenomReportBean;

public interface ICircleINDenomReportDao {

	public List<CircleINDenomReportBean> getAllDenominationwiseSalesReport(String circleid,String inid,String strFromDate,String strToDate);
}
