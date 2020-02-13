package com.nacre.resume_builder.db;

public class SqlQueryConstants {
	public static final String INSERT_INTO_REGISTER_USER_DETAILS="insert into register values(default,?,?,?)";
	public static final String INSERT_EDUCATION_DETAILS="insert into education_details values(default,?,?,?,?,?,?,?,?)";
	public static final String INSERT_PERSONAL_DETAILS="insert into personal_details values(default,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static final String INSERT_PROFESSION_DETAILS="insert into profession_details values(default,?,?,?,?,?,?)";
	public static final String INSERT_ACHIVEMENTS_DETAILS="insert into achivements values(default,?,?,?)";
	
	public static final String GET_ALL_COUNTRY_DETAILS="Select * from country";
	public static final String Get_ALL_STATES_DETAILS="select * from states where country_id=?";
	public static final String Get_ALL_CITY_DETAILS="select * from city where state_id=?";
	public static final String GET_ALL_PERSONAL_DETAILS="select * from personal_details where user_id=?";
	public static final String GET_ALL_ACHIVEMENTS_DETAILS="select * from achivements where user_id=?";
	
	
	public static final String UPDATE_EDUCATION_DETAILS="update education_details set degree=?,schooll=?,date_attend=?,percetage=?,board=?,total_marks=?,obtain_marks=? where edu_id=?;";
	public static final String UPDATE_PROFESSION_DETAILS="update profession_details set empname=?,from_date=?,to_date=?,job_title=?,duties=? where pro_id=?";
	public static final String UPDATE_PERSONAL_DETAILS="update personal_details set fname=?,lname=?,father_name=?,mother_name=?,dob=?,country_name=?,state_name=?,city_name=?,gender=?,pincode=?,addr=? where p_id=?";
	public static final String UPDATE_ACHIVEMENTS_DETAILS="update achivements set achivement=?,training=? where ach_id=?";
	
	public static final String GET_ALL_EDUCATION_DETAILS="select * from education_details where user_id=?";
	public static final String GET_ALL_PROFESSION_DETAILS="select * from profession_details where user_id=?";
	public static final String GET_LOGIN_DETAILS="select *from register where user_email=? and user_mob=?";
	public static final String GET_USER_ROLL_DETAILS="select * from user_roll";
	
	public static final String DELETE_EDUCATION_DETAILS="delete from education_details where edu_id=?";
	public static final String DELETE_PERSONAL_DETAILS="delete from personal_details where p_id=?";
	public static final String DELETE_PROFESSION_DETAILS="delete from profession_details where pro_id=?";
	public static final String DELETE_ACHIVEMENTS_DETAILS="delete from achivements where ach_id=?";
}
