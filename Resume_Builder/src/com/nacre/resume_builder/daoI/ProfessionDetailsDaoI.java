package com.nacre.resume_builder.daoI;

import java.sql.SQLException;
import java.util.List;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.dto.ProfessionDetailsDto;

public interface ProfessionDetailsDaoI {
	public boolean addProfessionDetailsDao(ProfessionDetailsDto pdd) throws DatabaseException, SQLException;
	
	public boolean updateProfessionDetailsDao(ProfessionDetailsDto pdd) throws DatabaseException, SQLException;
	
	public List<ProfessionDetailsDto> getAllProfessionDetailsDao(int uid)throws DatabaseException,SQLException;
	
	public boolean deleteProfessionDetailsDao(ProfessionDetailsDto professionDetailsDto)throws DatabaseException,SQLException; 
}
