package com.nacre.resume_builder.dto;

public class AddressDetailsDto {
	private Integer addrId;
	private Integer addrPin;
	private String address;
	private CityDetailsDto cityId;
	public Integer getAddrId() {
		return addrId;
	}
	public void setAddrId(Integer addrId) {
		this.addrId = addrId;
	}
	public Integer getAddrPin() {
		return addrPin;
	}
	public void setAddrPin(Integer addrPin) {
		this.addrPin = addrPin;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public CityDetailsDto getCityId() {
		return cityId;
	}
	public void setCityId(CityDetailsDto cityId) {
		this.cityId = cityId;
	}
	

}
