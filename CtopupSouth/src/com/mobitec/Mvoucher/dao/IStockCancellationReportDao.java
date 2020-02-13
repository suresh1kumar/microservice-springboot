package com.mobitec.Mvoucher.dao;

import java.util.List;

import com.mobitec.Mvoucher.domain.StockCancellationReportBean;

public interface IStockCancellationReportDao {
	public List<StockCancellationReportBean> getAllStockCancellationReport(String wallet,String wichDate, String srcNumbOrIdOptn, String srcNumberOrId,
			String SearchOn, String strFromDate, String strToDate);

}
//(wallet + "~" + srcNumbOrIdOptn + "~" + srcNumberOrId + "~" + SearchOn + "~" + fromDate + "~" + toDate);