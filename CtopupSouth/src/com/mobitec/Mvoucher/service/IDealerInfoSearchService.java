package com.mobitec.Mvoucher.service;

import java.util.List;

import com.mobitec.Mvoucher.domain.DealerInfoSearchBean;

public interface IDealerInfoSearchService {
	
	public List<DealerInfoSearchBean> getStockAllocationDetails(String Zone, String Circle, String Ssa,
			String DealerCode, String FirstName, String SecondName, String LastName, String ContactNumber,
			String MobileNumber, String Authorised, String Status);

}
