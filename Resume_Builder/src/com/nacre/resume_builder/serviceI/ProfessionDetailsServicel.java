package com.nacre.resume_builder.serviceI;

import java.sql.SQLException;
import java.util.List;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.dto.ProfessionDetailsDto;

public interface ProfessionDetailsServicel {
	public boolean addProfessionDetailsSevice(ProfessionDetailsDto pdd) throws DatabaseException, SQLException;
	
	public List<ProfessionDetailsDto> getAllProfessionalDetailsService(int uid)throws DatabaseException, SQLException;
	
	public boolean updateProfessionService(ProfessionDetailsDto professionDetailsDto)throws DatabaseException,SQLException;

	public boolean deleteProfessionService(ProfessionDetailsDto professionDetailsDto)throws DatabaseException,SQLException;
}
