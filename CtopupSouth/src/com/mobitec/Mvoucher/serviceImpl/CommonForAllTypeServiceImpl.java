package com.mobitec.Mvoucher.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobitec.Mvoucher.dao.ICommonForAllTypeDao;
import com.mobitec.Mvoucher.domain.ChannelType;
import com.mobitec.Mvoucher.domain.Descriptionin_DetailsBean;
import com.mobitec.Mvoucher.domain.WalletTypeBean;
import com.mobitec.Mvoucher.service.ICommonForAllTypeService;

@Service
public class CommonForAllTypeServiceImpl implements ICommonForAllTypeService{

	@Autowired
	private ICommonForAllTypeDao commonForAllTypeDao;
	
	@Override
	public List<ChannelType> getChannel() {
		// TODO Auto-generated method stub
		return commonForAllTypeDao.getChannel();
	}

	@Override
	public List<WalletTypeBean> getAllWalletType() {
		// TODO Auto-generated method stub
		return commonForAllTypeDao.getAllWalletType();
	}

	@Override
	public List<Descriptionin_DetailsBean> getDescriptionin_Details() {
		// TODO Auto-generated method stub
		return commonForAllTypeDao.getDescriptionin_Details();
	}

}
