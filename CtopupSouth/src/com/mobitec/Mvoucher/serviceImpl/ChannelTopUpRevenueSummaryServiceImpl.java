package com.mobitec.Mvoucher.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobitec.Mvoucher.dao.IChannelTopUpRevenueSummaryDao;
import com.mobitec.Mvoucher.domain.ChannelTopUpRevenueSummaryBean;
import com.mobitec.Mvoucher.service.IChannelTopUpRevenueSummaryService;

@Service
public class ChannelTopUpRevenueSummaryServiceImpl implements IChannelTopUpRevenueSummaryService{

	@Autowired
	public IChannelTopUpRevenueSummaryDao iChannelTopUpRevenueSummaryDao;
	@Override
	public List<ChannelTopUpRevenueSummaryBean> getAllChannelTopUpRevenueSummaryReport(String zoneFname, String strregNam,
			String strcityNam, String strFromDate, String strToDate) {
		// TODO Auto-generated method stub
		return iChannelTopUpRevenueSummaryDao.getAllChannelTopUpRevenueSummaryReport(zoneFname, strregNam, strcityNam, strFromDate, strToDate);
	}

}
