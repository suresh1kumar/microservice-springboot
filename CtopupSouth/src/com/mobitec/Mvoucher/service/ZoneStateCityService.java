package com.mobitec.Mvoucher.service;

import java.util.List;

import com.mobitec.Mvoucher.domain.City;
import com.mobitec.Mvoucher.domain.State;
import com.mobitec.Mvoucher.domain.Zone;


public interface ZoneStateCityService{
	
	    public List<Zone> getZone();
	    public List<City> getCity(String count);
		public List<State> getState(String count);
		public List<State> getStatesingle();

}
