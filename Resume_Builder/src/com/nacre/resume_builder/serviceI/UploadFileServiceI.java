package com.nacre.resume_builder.serviceI;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.dto.UploadFileDto;

public interface UploadFileServiceI {
	public boolean uploadFileServce(UploadFileDto uploadFileDto)throws DatabaseException, FileNotFoundException, SQLException, IOException;
}
