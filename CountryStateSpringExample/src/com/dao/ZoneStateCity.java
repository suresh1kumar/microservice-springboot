package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bean.City;
import com.bean.State;
import com.bean.Zone;

@Repository
public class ZoneStateCity {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private final String SELECT_QUERY = "select zid, ZNAME from zone1";

	public List<Zone> getZone() {
		return jdbcTemplate.query(SELECT_QUERY, new ZoneRowMapper());
	}

	private final class ZoneRowMapper implements RowMapper<Zone> {

		@Override
		public Zone mapRow(ResultSet rs, int args) throws SQLException {
			System.out.println("country dao::" + rs.getString("ZID"));
			System.out.println("country dao::" + rs.getString("ZNAME"));
			return new Zone(rs.getString("ZID"), rs.getString("ZNAME"));
		}

	}

	// STATE
	public List<State> getState(String count) {
		//String SELECT_STATE = "select * from state1 where ZID='" + ZID + "'";
		// String sql="delete from Emp99 where id="+id+""; 
		 String SELECT_STATE = "select * from state1 where zid='"+count+"'";
		return jdbcTemplate.query(SELECT_STATE, new StateRowMapper());
	}

	private final class StateRowMapper implements RowMapper<State> {

		@Override
		public State mapRow(ResultSet rs, int args) throws SQLException {
			System.out.println("State Dao ::" + rs.getString("SID"));
			System.out.println("State Dao ::" + rs.getString("SNAME"));
			return new State(rs.getString("SID"), rs.getString("SNAME"));
		}

	}

	public List<City> getCity(String count) {

		//String SELECT_STATE = "select * from CITY1 where SID='" + SID + "'";
		 // String sql="delete from Emp99 where id="+id+"";  
		  String SELECT_STATE="select * from city1 where sid='"+count+"'";
		return jdbcTemplate.query(SELECT_STATE, new CityRowMapper());
	}

	private final class CityRowMapper implements RowMapper<City> {

		@Override
		public City mapRow(ResultSet rs, int args) throws SQLException {
			System.out.println("State Dao ::" + rs.getString("CID"));
			System.out.println("State Dao ::" + rs.getString("CNAME"));
			return new City(rs.getString("CID"), rs.getString("CNAME"));
		}

	}

}
