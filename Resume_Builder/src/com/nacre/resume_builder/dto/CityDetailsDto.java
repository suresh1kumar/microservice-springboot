package com.nacre.resume_builder.dto;

public class CityDetailsDto {
	private Integer cityId;
	private String cityName;
	private StateDetailsDto stateId;
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public StateDetailsDto getStateId() {
		return stateId;
	}
	public void setStateId(StateDetailsDto stateId) {
		this.stateId = stateId;
	}
	
	
}
