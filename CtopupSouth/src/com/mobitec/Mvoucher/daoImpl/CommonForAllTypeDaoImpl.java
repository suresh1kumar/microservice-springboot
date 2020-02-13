package com.mobitec.Mvoucher.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mobitec.Mvoucher.dao.ICommonForAllTypeDao;
import com.mobitec.Mvoucher.domain.ChannelType;
import com.mobitec.Mvoucher.domain.Descriptionin_DetailsBean;
import com.mobitec.Mvoucher.domain.WalletTypeBean;

@Repository
public class CommonForAllTypeDaoImpl implements ICommonForAllTypeDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<ChannelType> getChannel() {
		
		String query = "select req_type ,REQUEST_FROM from REQUEST_TYPE ";
		return jdbcTemplate.query(query, new ChannelRowMapper());
	}

	private final class ChannelRowMapper implements RowMapper<ChannelType> {
		@Override
		public ChannelType mapRow(ResultSet rs, int args) throws SQLException {
			System.out.println("Channel Type Dao ::" + rs.getString("req_type"));
			System.out.println("Channel Type Dao ::" + rs.getString("REQUEST_FROM"));
			return new ChannelType(rs.getString("req_type"), rs.getString("REQUEST_FROM"));
		}

	}

	@Override
	public List<WalletTypeBean> getAllWalletType() {
		
			String query = " select WA_ID,WALLET_NAME from MWA_WALLET_DETAILS ";
			return jdbcTemplate.query(query, new WalletTypeRowMapper());
		}

		private final class WalletTypeRowMapper implements RowMapper<WalletTypeBean> {
			@Override
			public WalletTypeBean mapRow(ResultSet rs, int args) throws SQLException {
				System.out.println("Wallet Type Dao ::" + rs.getString("WA_ID"));
				System.out.println("Wallet Type Dao ::" + rs.getString("WALLET_NAME"));
				return new WalletTypeBean(rs.getInt("WA_ID"), rs.getString("WALLET_NAME"));
			}

		}

		@Override
		public List<Descriptionin_DetailsBean> getDescriptionin_Details() {
			String query = " select IN_ID,DESCRIPTION from IN_DETAILS ";
			return jdbcTemplate.query(query, new Descriptionin_DetailsRowMapper());
		}
		private final class Descriptionin_DetailsRowMapper implements RowMapper<Descriptionin_DetailsBean> {
			@Override
			public Descriptionin_DetailsBean mapRow(ResultSet rs, int args) throws SQLException {
				System.out.println("DESCRIPTION Type Dao ::" + rs.getString("IN_ID"));
				System.out.println("DESCRIPTION Type Dao ::" + rs.getString("DESCRIPTION"));
				return new Descriptionin_DetailsBean(rs.getInt("IN_ID"), rs.getString("DESCRIPTION"));
			}

		}

}
