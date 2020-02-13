package com.nacre.resume_builder.serviceI;

import java.sql.SQLException;
import java.util.List;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.dto.AchivementsDto;

public interface AchivementsServiceI {
	public boolean addAchivementsService(AchivementsDto achdto)throws DatabaseException, SQLException;
	
	public List<AchivementsDto> getAllAchivementsService(int achid)throws DatabaseException, SQLException;
	
	public boolean updateAchivementsDetailsService(AchivementsDto achivementsDto)throws DatabaseException, SQLException;
	
	public boolean deleteAchivementsDetailsService(AchivementsDto achivementsDto)throws DatabaseException, SQLException;
}
