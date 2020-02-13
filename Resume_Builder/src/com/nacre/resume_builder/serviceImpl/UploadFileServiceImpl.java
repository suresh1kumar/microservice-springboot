package com.nacre.resume_builder.serviceImpl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.dto.UploadFileDto;
import com.nacre.resume_builder.serviceI.UploadFileServiceI;

public class UploadFileServiceImpl implements UploadFileServiceI{

	

	@Override
	public boolean uploadFileServce(UploadFileDto uploadFileDto)
			throws DatabaseException, FileNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		return false;
	}

	

}
