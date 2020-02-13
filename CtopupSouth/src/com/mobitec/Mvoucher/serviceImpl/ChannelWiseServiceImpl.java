package com.mobitec.Mvoucher.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobitec.Mvoucher.dao.IChannelWiseDao;
import com.mobitec.Mvoucher.domain.ChannelWiseBean;
import com.mobitec.Mvoucher.service.IChannelWiseService;



@Service
public class ChannelWiseServiceImpl implements IChannelWiseService{

	@Autowired
	private IChannelWiseDao iChannelWiseDao;
	
	@Override
	public List<ChannelWiseBean> getAllChannelWiseReport(String status, String req_type, String dest_circle_id, String DEST_ZONE_ID,
			String wichDate, String strFromDate, String strToDate, String cityid) {
		// TODO Auto-generated method stub
		return iChannelWiseDao.getAllChannelWiseReport(status, req_type, dest_circle_id, DEST_ZONE_ID, wichDate, strFromDate, strToDate, cityid);
	}

}
