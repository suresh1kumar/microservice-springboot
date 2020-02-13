package com.mobitec.Mvoucher.domain;

public class WalletTypeBean {
	
	private int WA_ID ;
	private String WALLET_NAME;
	public WalletTypeBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WalletTypeBean(int wA_ID, String wALLET_NAME) {
		super();
		WA_ID = wA_ID;
		WALLET_NAME = wALLET_NAME;
	}
	public int getWA_ID() {
		return WA_ID;
	}
	public void setWA_ID(int wA_ID) {
		WA_ID = wA_ID;
	}
	public String getWALLET_NAME() {
		return WALLET_NAME;
	}
	public void setWALLET_NAME(String wALLET_NAME) {
		WALLET_NAME = wALLET_NAME;
	}
	@Override
	public String toString() {
		return "WalletTypeBean [WA_ID=" + WA_ID + ", WALLET_NAME=" + WALLET_NAME + "]";
	}
	

}
