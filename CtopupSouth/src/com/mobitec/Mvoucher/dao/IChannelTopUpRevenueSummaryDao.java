package com.mobitec.Mvoucher.dao;

import java.util.List;

import com.mobitec.Mvoucher.domain.ChannelTopUpRevenueSummaryBean;

public interface IChannelTopUpRevenueSummaryDao {
	
		public List<ChannelTopUpRevenueSummaryBean> getAllChannelTopUpRevenueSummaryReport(String zoneFname,String strregNam,String strcityNam,String strFromDate,String strToDate);
		

}
