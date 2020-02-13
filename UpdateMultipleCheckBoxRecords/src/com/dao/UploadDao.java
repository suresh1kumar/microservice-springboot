package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.bean.Upload;

public interface UploadDao {
	
	public List<Upload> getAllUploadRecord() throws SQLException;
	
	public boolean updateUploadRecordDao(Upload upload) throws SQLException;
	
	
	//uploadDao.updateUploadRecordDao(upload.setName(name[i]),upload.setPrice(price[i]),upload.setStatus(status[i]));
	//public boolean updateUploadRecordDaos(Upload upload[]) throws SQLException;

	public Upload getProductId(int sno) throws SQLException;
}
