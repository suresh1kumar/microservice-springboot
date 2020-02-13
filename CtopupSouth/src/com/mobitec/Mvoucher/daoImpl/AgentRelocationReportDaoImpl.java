package com.mobitec.Mvoucher.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mobitec.Mvoucher.dao.IAgentRelocationReportDao;
import com.mobitec.Mvoucher.domain.AgentRelocationReportBean;
import com.mobitec.Mvoucher.domain.ChannelWiseBean;

@Repository
public class AgentRelocationReportDaoImpl implements IAgentRelocationReportDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<AgentRelocationReportBean> getAllAgentRelocationReport(String fromdate, String todate, String msdn) {
		 
		String query=" SELECT C.C_FULLNAME,B.FIRST_NAME,B.AUTHORISED_MOBILE_NUMBER,CATEGORY_BEF,	CATEGORY_AFT,GETDLRMOBILENUM(A.REF_ID_AFT) CURRENT_PARENT,GETDLRNAME(A.MAS_ID_BEF) CURRENT_TOP_LVL,"+
				" GETDLRMOBILENUM(A.REF_ID_BEF) PREVIOUS_PARENT,GETDLRNAME(A.MAS_ID_AFT) PREVIOUS_TOP_LVL,	A.INSERT_DATE DATE_TIME	" +
				" FROM	TBL_DLR_MOVEMENT A,DEALER_INFO	B,MVCLIENT.TBL_CITY C WHERE A.SRC_DLR_ID =B.DEALER_ID AND B.CITYID=C.CITYID AND ";
								
					if(msdn !=null && !msdn.equalsIgnoreCase("")){
						query+=" A.SRCMSISDN='"+msdn+"' AND";//MVCLIENT.TBL_CITY
					}
								
					if(todate !=null && fromdate !=null){
					    query+=" A.INSERT_DATE between TO_DATE('"+fromdate+"','DD-MM-YYYY') and TO_DATE('"+todate+"','DD-MM-YYYY')+0.99999";
					}
					query = query + " order by A.INSERT_DATE DESC ";
				        System.out.println("query:"+query);
		return jdbcTemplate.query(query, new AgentRelocationReportRowMapper());
	  //return jdbcTemplate.query(query, new BeanPropertyRowMapper<AgentRelocationReportBean>(AgentRelocationReportBean.class));
	}
	private final class AgentRelocationReportRowMapper implements RowMapper<AgentRelocationReportBean> {
		@Override
		public AgentRelocationReportBean mapRow(ResultSet rs, int args) throws SQLException {

			AgentRelocationReportBean agentRelocationReportBean = new AgentRelocationReportBean();
			
			agentRelocationReportBean.setC_FULLNAME(rs.getString("C_FULLNAME"));
			System.out.println("===================1");
			agentRelocationReportBean.setFIRST_NAME(rs.getString("FIRST_NAME"));
			System.out.println("===================2");
			agentRelocationReportBean.setAUTHORISED_MOBILE_NUMBER(rs.getString("AUTHORISED_MOBILE_NUMBER"));
			System.out.println("===================3");
			agentRelocationReportBean.setCATEGORY_BEF(rs.getString("CATEGORY_BEF"));
			System.out.println("===================4");
			agentRelocationReportBean.setCATEGORY_AFT(rs.getString("CATEGORY_AFT"));
			System.out.println("===================5");
			agentRelocationReportBean.setREF_ID_AFT(rs.getString("CURRENT_PARENT"));
			System.out.println("===================6");
			agentRelocationReportBean.setREF_ID_BEF(rs.getString("PREVIOUS_PARENT"));
			System.out.println("===================7");
			agentRelocationReportBean.setMAS_ID_AFT(rs.getString("PREVIOUS_TOP_LVL"));
			System.out.println("===================8");
			agentRelocationReportBean.setMAS_ID_BEF(rs.getString("CURRENT_TOP_LVL"));
			System.out.println("===================9");
			agentRelocationReportBean.setINSERT_DATE(rs.getDate("DATE_TIME"));
			System.out.println("===================10");

			System.out.println("dao channelwisedata ::"+agentRelocationReportBean.toString());
			return agentRelocationReportBean;
		}

	}

}
