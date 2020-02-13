package com.mobitec.Mvoucher.service;

import java.util.List;

import com.mobitec.Mvoucher.domain.ChannelTopUpRevenueSummaryBean;

public interface IChannelTopUpRevenueSummaryService {
	
	public List<ChannelTopUpRevenueSummaryBean> getAllChannelTopUpRevenueSummaryReport(String zoneFname, String strregNam,
			String strcityNam, String strFromDate, String strToDate);

}
