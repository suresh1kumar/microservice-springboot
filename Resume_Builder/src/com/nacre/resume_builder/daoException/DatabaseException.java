package com.nacre.resume_builder.daoException;

public class DatabaseException  extends Exception{

	public DatabaseException(String str){
		
		super(str);
	}

	@Override
	public String toString() {
		return "DatabaseException [toString()=" + super.toString() + "]";
	}
	
	
}
