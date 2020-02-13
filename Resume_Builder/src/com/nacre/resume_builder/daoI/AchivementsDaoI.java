package com.nacre.resume_builder.daoI;

import java.sql.SQLException;
import java.util.List;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.dto.AchivementsDto;

public interface AchivementsDaoI {
	
	public boolean addAchivementsDao(AchivementsDto achivementsDto) throws DatabaseException, SQLException;
	
	public List<AchivementsDto> getAllAchichivementsDao(int achid)throws DatabaseException, SQLException;
	
	public boolean updateAchivementsDao(AchivementsDto achivementsDto)throws DatabaseException, SQLException;
	
	public boolean deleteAchivementsDao(AchivementsDto achivementsDto)throws DatabaseException, SQLException;
}
