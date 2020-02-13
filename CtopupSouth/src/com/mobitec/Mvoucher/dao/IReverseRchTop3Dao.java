package com.mobitec.Mvoucher.dao;

import java.util.List;

import com.mobitec.Mvoucher.domain.ReverseRchTop3Bean;

public interface IReverseRchTop3Dao {
	
	public List<ReverseRchTop3Bean> getAllReverseRechargeTopupReport(String circle,String descriptionin,String transStatus,String srcMobileNumber,String destMobileNumber,String fromDate,String toDate);
	
	
}
