package com.mobitec.Mvoucher.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobitec.Mvoucher.dao.IDealerInfoSearchDao;
import com.mobitec.Mvoucher.domain.DealerInfoSearchBean;
import com.mobitec.Mvoucher.service.IDealerInfoSearchService;

@Service
public class DealerInfoSearchServiceImpl implements IDealerInfoSearchService{

	@Autowired
	public IDealerInfoSearchDao iDealerInfoSearchDao;
	@Override
	public List<DealerInfoSearchBean> getStockAllocationDetails(String Zone, String Circle, String Ssa,
			String DealerCode, String FirstName, String SecondName, String LastName, String ContactNumber,
			String MobileNumber, String Authorised, String Status) {
		// TODO Auto-generated method stub
		return iDealerInfoSearchDao.getStockAllocationDetails(Zone, Circle, Ssa, DealerCode, FirstName, SecondName, LastName, ContactNumber, MobileNumber, Authorised, Status);
	}

}
