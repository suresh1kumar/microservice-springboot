package com.nacre.resume_builder.dto;

public class StateDetailsDto {
	private Integer state_id;
	private String state_name;
	private CountryDetailsDto country_id;
	public Integer getState_id() {
		return state_id;
	}
	public void setState_id(Integer state_id) {
		this.state_id = state_id;
	}
	public String getState_name() {
		return state_name;
	}
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	public CountryDetailsDto getCountry_id() {
		return country_id;
	}
	public void setCountry_id(CountryDetailsDto country_id) {
		this.country_id = country_id;
	}
	
}
