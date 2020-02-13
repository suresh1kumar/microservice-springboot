package com.nacre.resume_builder.serviceImpl;

import java.sql.SQLException;
import java.util.List;

import com.nacre.resume_builder.DaoImpl.AchivementsDaoImpl;
import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.daoI.AchivementsDaoI;
import com.nacre.resume_builder.db.DbUtil;
import com.nacre.resume_builder.dto.AchivementsDto;
import com.nacre.resume_builder.serviceI.AchivementsServiceI;

public class AchivementsServiceImpl implements AchivementsServiceI{

	@Override
	public boolean addAchivementsService(AchivementsDto achdto) throws DatabaseException, SQLException {
		AchivementsDaoI achivementsDaoI=new AchivementsDaoImpl();
		
		return achivementsDaoI.addAchivementsDao(achdto);
	}

	@Override
	public List<AchivementsDto> getAllAchivementsService(int achid) throws DatabaseException, SQLException {
		AchivementsDaoI achivementsDaoI=new AchivementsDaoImpl();
		return achivementsDaoI.getAllAchichivementsDao(achid);
	}

	@Override
	public boolean updateAchivementsDetailsService(AchivementsDto achivementsDto)
			throws DatabaseException, SQLException {
		AchivementsDaoI achivementsDaoI=new AchivementsDaoImpl();
		
		return achivementsDaoI.updateAchivementsDao(achivementsDto);
	}

	@Override
	public boolean deleteAchivementsDetailsService(AchivementsDto achivementsDto)
			throws DatabaseException, SQLException {
	AchivementsDaoI achivementsDaoI=new AchivementsDaoImpl();
	return achivementsDaoI.deleteAchivementsDao(achivementsDto);
	}

}
