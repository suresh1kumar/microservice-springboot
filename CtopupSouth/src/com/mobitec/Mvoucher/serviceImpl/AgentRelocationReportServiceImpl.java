package com.mobitec.Mvoucher.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobitec.Mvoucher.dao.IAgentRelocationReportDao;
import com.mobitec.Mvoucher.domain.AgentRelocationReportBean;
import com.mobitec.Mvoucher.service.IAgentRelocationReportService;

@Service
public class AgentRelocationReportServiceImpl implements IAgentRelocationReportService{

	@Autowired
	public IAgentRelocationReportDao agentRelocationReportDao;
	@Override
	public List<AgentRelocationReportBean> getAllAgentRelocationReport(String fromdate, String todate, String msdn) {
		// TODO Auto-generated method stub
		return agentRelocationReportDao.getAllAgentRelocationReport(fromdate, todate, msdn);
	}

}
