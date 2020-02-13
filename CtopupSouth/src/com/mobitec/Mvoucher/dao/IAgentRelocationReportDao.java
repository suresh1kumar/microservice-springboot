package com.mobitec.Mvoucher.dao;

import java.util.List;

import com.mobitec.Mvoucher.domain.AgentRelocationReportBean;

public interface IAgentRelocationReportDao {
	
	public List<AgentRelocationReportBean> getAllAgentRelocationReport(String fromdate,String todate,String msdn);

}
