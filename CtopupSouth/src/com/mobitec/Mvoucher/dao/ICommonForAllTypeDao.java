package com.mobitec.Mvoucher.dao;

import java.util.List;

import com.mobitec.Mvoucher.domain.ChannelType;
import com.mobitec.Mvoucher.domain.Descriptionin_DetailsBean;
import com.mobitec.Mvoucher.domain.WalletTypeBean;

public interface ICommonForAllTypeDao {
	public List<ChannelType> getChannel();
	public List<WalletTypeBean> getAllWalletType();
	public List<Descriptionin_DetailsBean> getDescriptionin_Details();

}
