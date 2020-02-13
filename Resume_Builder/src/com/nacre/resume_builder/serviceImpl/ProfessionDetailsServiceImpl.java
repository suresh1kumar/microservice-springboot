package com.nacre.resume_builder.serviceImpl;

import java.sql.SQLException;
import java.util.List;

import com.nacre.resume_builder.DaoImpl.ProfessionDetailsDaoImpl;
import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.daoI.ProfessionDetailsDaoI;
import com.nacre.resume_builder.dto.ProfessionDetailsDto;
import com.nacre.resume_builder.serviceI.ProfessionDetailsServicel;

public class ProfessionDetailsServiceImpl implements ProfessionDetailsServicel{

	@Override
	public boolean addProfessionDetailsSevice(ProfessionDetailsDto pdd) throws DatabaseException, SQLException {
		ProfessionDetailsDaoI professionDetailsDaoI=new ProfessionDetailsDaoImpl();
		
		return professionDetailsDaoI.addProfessionDetailsDao(pdd);
	}

	@Override
	public List<ProfessionDetailsDto> getAllProfessionalDetailsService(int uid) throws DatabaseException, SQLException {
		ProfessionDetailsDaoI professionDetailsDaoI=new ProfessionDetailsDaoImpl();
		return professionDetailsDaoI.getAllProfessionDetailsDao(uid);
	}
	
	@Override
	public boolean updateProfessionService(ProfessionDetailsDto professionDetailsDto)
			throws DatabaseException, SQLException {
		ProfessionDetailsDaoI professionDetailsDaoI=new ProfessionDetailsDaoImpl();
		return professionDetailsDaoI.updateProfessionDetailsDao(professionDetailsDto);
	}

	@Override
	public boolean deleteProfessionService(ProfessionDetailsDto professionDetailsDto)
			throws DatabaseException, SQLException {
		ProfessionDetailsDaoI professionDetailsDaoI=new ProfessionDetailsDaoImpl();
		
		return professionDetailsDaoI.deleteProfessionDetailsDao(professionDetailsDto);
	}
	
	


	

}
