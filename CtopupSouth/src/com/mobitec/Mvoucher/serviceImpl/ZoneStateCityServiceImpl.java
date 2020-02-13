package com.mobitec.Mvoucher.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobitec.Mvoucher.dao.ZoneStateCityDao;
import com.mobitec.Mvoucher.domain.City;
import com.mobitec.Mvoucher.domain.State;
import com.mobitec.Mvoucher.domain.Zone;
import com.mobitec.Mvoucher.service.ZoneStateCityService;




@Repository
public class ZoneStateCityServiceImpl implements ZoneStateCityService{

	@Autowired
	private ZoneStateCityDao zoneStateCityDao;
	@Override
	public List<Zone> getZone() {
		// TODO Auto-generated method stub
		return zoneStateCityDao.getZone();
	}
	@Override
	public List<State> getState(String count) {
		// TODO Auto-generated method stub
		return zoneStateCityDao.getState(count);
	}
	@Override
	public List<City> getCity(String count) {
		// TODO Auto-generated method stub
		return zoneStateCityDao.getCity(count);
	}
	@Override
	public List<State> getStatesingle() {
		// TODO Auto-generated method stub
		return zoneStateCityDao.getStatesingle();
	}
	

}
