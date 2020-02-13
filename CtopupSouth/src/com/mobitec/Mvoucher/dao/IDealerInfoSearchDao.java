package com.mobitec.Mvoucher.dao;

import java.util.List;

import com.mobitec.Mvoucher.domain.DealerInfoSearchBean;

public interface IDealerInfoSearchDao {
	
	
	public List<DealerInfoSearchBean> getStockAllocationDetails(String Zone,String Circle,String Ssa,String DealerCode,String FirstName,String SecondName,String LastName,String ContactNumber,String MobileNumber,String Authorised,String Status);
	
	

}
