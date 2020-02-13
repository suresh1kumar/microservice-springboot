package com.mobitec.Mvoucher.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobitec.Mvoucher.dao.IReverseRchTop3Dao;
import com.mobitec.Mvoucher.domain.ReverseRchTop3Bean;
import com.mobitec.Mvoucher.service.IReverseRchTop3Service;

@Service
public class ReverseRchTop3ServiceImpl implements IReverseRchTop3Service{

	@Autowired
	public IReverseRchTop3Dao iReverseRchTop3Dao;
	@Override
	public List<ReverseRchTop3Bean> getAllReverseRechargeTopupReport(String circle,String descriptionin,String transStatus,String srcMobileNumber,String destMobileNumber,String fromDate,String toDate){
		// TODO Auto-generated method stub
		return iReverseRchTop3Dao.getAllReverseRechargeTopupReport(circle, descriptionin, transStatus, srcMobileNumber, destMobileNumber, fromDate, toDate);
	}

}
