package com.mobitec.Mvoucher.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobitec.Mvoucher.dao.IStockCancellationReportDao;
import com.mobitec.Mvoucher.domain.StockCancellationReportBean;
import com.mobitec.Mvoucher.service.IStockCancellationReportService;

@Service
public class StockCancellationReportServiceImpl implements IStockCancellationReportService{

	@Autowired
	private IStockCancellationReportDao stockCancellationReportDao;
	
	
	@Override
	public List<StockCancellationReportBean> getAllStockCancellationReport(String wallet, String wichDate,
			String srcNumbOrIdOptn, String srcNumberOrId, String SearchOn, String strFromDate, String strToDate) {
		// TODO Auto-generated method stub
		return stockCancellationReportDao.getAllStockCancellationReport(wallet, wichDate, srcNumbOrIdOptn, srcNumberOrId, SearchOn, strFromDate, strToDate);
	}

}
