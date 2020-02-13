package com.mobitec.Mvoucher.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mobitec.Mvoucher.dao.ZoneStateCityDao;
import com.mobitec.Mvoucher.domain.City;
import com.mobitec.Mvoucher.domain.State;
import com.mobitec.Mvoucher.domain.Zone;




@Repository
public class ZoneStateCity implements ZoneStateCityDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	//private final String SELECT_QUERY = "select zid, ZNAME from zone1";
	private final String SELECT_QUERY="select zoneid,z_fullname from mvclient.tbl_zone";

	public List<Zone> getZone() {
		return jdbcTemplate.query(SELECT_QUERY, new ZoneRowMapper());
		//return jdbcTemplate.query(SpringSqlQueryConstants.SELECT_QUERY, new ZoneRowMapper());
	}

	private final class ZoneRowMapper implements RowMapper<Zone> {

		@Override
		public Zone mapRow(ResultSet rs, int args) throws SQLException {
			System.out.println("country_Id dao::" + rs.getString("zoneid")+"country_Name dao::"+rs.getString("z_fullname"));
			//System.out.println("country dao::" + rs.getString("z_fullname"));
			return new Zone(rs.getString("zoneid"), rs.getString("z_fullname"));
		}

	}

	// STATE
	public List<State> getState(String count) {
		// String SELECT_STATE = "select * from state1 where zid='"+count+"'";
		 String SELECT_STATE="select regionid,r_fullname from mvclient.tbl_region where ZONEID='"+count+"'";
		return jdbcTemplate.query(SELECT_STATE, new StateRowMapper());
	}

	private final class StateRowMapper implements RowMapper<State> {

		@Override
		public State mapRow(ResultSet rs, int args) throws SQLException {
			System.out.println("State_Id Dao ::" + rs.getString("regionid")+"State_Name Dao ::"+rs.getString("r_fullname"));
			//System.out.println("State Dao ::" + rs.getString("r_fullname"));
			return new State(rs.getString("regionid"), rs.getString("r_fullname"));
		}
	}
//===================================================	
	public List<State> getStatesingle() {
		// String SELECT_STATE = "select * from state1 where zid='"+count+"'";
		 String SELECT_STATE="select regionid,r_fullname from mvclient.tbl_region";
		return jdbcTemplate.query(SELECT_STATE, new StateSingleRowMapper());
	}
	private final class StateSingleRowMapper implements RowMapper<State> {
		@Override
		public State mapRow(ResultSet rs, int args) throws SQLException {
			System.out.println("State_Id Dao ::" + rs.getString("regionid")+"State_Name Dao ::"+rs.getString("r_fullname"));
			//System.out.println("State Dao ::" + rs.getString("r_fullname"));
			return new State(rs.getString("regionid"), rs.getString("r_fullname"));
		}
	}
	
//City
	public List<City> getCity(String count) {
		 // String SELECT_STATE="select cid,cname from city1 where sid='"+count+"'";
		  String SELECT_STATE="select cityid,c_fullname from mvclient.tbl_city where regionid='"+count+"'";
		return jdbcTemplate.query(SELECT_STATE, new CityRowMapper());
	}

	private final class CityRowMapper implements RowMapper<City> {

		@Override
		public City mapRow(ResultSet rs, int args) throws SQLException {
			System.out.println("City_Id Dao ::" + rs.getString("cityid")+"City_Name Dao ::"+rs.getString("c_fullname"));
			//System.out.println("City Dao ::" + rs.getString("c_fullname"));
			return new City(rs.getString("cityid"), rs.getString("c_fullname"));
		}

	}

}
