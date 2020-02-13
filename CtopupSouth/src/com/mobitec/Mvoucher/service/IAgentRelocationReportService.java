package com.mobitec.Mvoucher.service;

import java.util.List;

import com.mobitec.Mvoucher.domain.AgentRelocationReportBean;

public interface IAgentRelocationReportService {
	
	public List<AgentRelocationReportBean> getAllAgentRelocationReport(String fromdate, String todate, String msdn);

}
