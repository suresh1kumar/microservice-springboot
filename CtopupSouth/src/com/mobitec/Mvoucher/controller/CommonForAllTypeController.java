package com.mobitec.Mvoucher.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mobitec.Mvoucher.domain.ChannelType;
import com.mobitec.Mvoucher.domain.Descriptionin_DetailsBean;
import com.mobitec.Mvoucher.domain.WalletTypeBean;
import com.mobitec.Mvoucher.service.ICommonForAllTypeService;

@Controller
public class CommonForAllTypeController {
	
	@Autowired
	private ICommonForAllTypeService commonForAllTypeService;
	
	@RequestMapping("/display6")
	public String showAddStudent() {
		System.out.println("-----------------------");
		return "display6";
	}
	
	@RequestMapping(value = "/getAllChannel",method = RequestMethod.GET)
	@ResponseBody
	public List<ChannelType> getState() {
		System.out.println("*******************<Channel Controller>*******************");
		    
		List<ChannelType> list = new ArrayList<>();

		list = commonForAllTypeService.getChannel();
		System.out.println("Channel Controller list date === :::"+list);
		System.out.println("Channel Controller list date === :::"+list.size());
		return list;
	}
	/*@RequestMapping("/display7")
	public String showAllChannel() {
		System.out.println("-----------------------");
		return "display7";
	}*/
	
	@RequestMapping(value = "/getAllWallet",method = RequestMethod.GET)
	@ResponseBody
	public List<WalletTypeBean> getAllWalletType() {
		System.out.println("*******************<Wallet Controller>*******************");
		    
		List<WalletTypeBean> listWallet = new ArrayList<>();

		listWallet = commonForAllTypeService.getAllWalletType();
		System.out.println("Wallet Controller list date === :::"+listWallet);
		System.out.println("Wallet Controller list date === :::"+listWallet.size());
		return listWallet;
	}
	
	@RequestMapping(value = "/getAllDescriptionin_Details",method = RequestMethod.GET)
	@ResponseBody
	public List<Descriptionin_DetailsBean> getAllDescriptionin_Details() {
		System.out.println("*******************<Descriptionin_Details Controller>*******************");
		    
		List<Descriptionin_DetailsBean> listDescriptionin_Details = new ArrayList<>();

		listDescriptionin_Details = commonForAllTypeService.getDescriptionin_Details();
		System.out.println("Descriptionin_Details Controller list date === :::"+listDescriptionin_Details.toString());
		System.out.println("Descriptionin_Details Controller list date === :::"+listDescriptionin_Details.size());
		return listDescriptionin_Details;
	}


}
