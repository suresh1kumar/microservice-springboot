package com.nacre.resume_builder.daoI;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.nacre.resume_builder.daoException.DatabaseException;

public interface UploadFileDaoI {
	public boolean uploadFileDao(String path) throws DatabaseException, FileNotFoundException, SQLException, IOException;
}
