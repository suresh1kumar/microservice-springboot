package com.nacre.resume_builder.db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.nacre.resume_builder.daoException.DatabaseException;


public class DbUtil {
	
	private DbUtil() {

	}

	/*
	 * Database user name.
	 */
	private static String UNAME;

	/*
	 * Database password.
	 */
	private static String PWD;

	/*
	 * Database driver class name i.e com.mysql.jdbc.Driver .
	 */
	private static String DRIVER;

	/*
	 * Database connection url name i.e jdbc:mysql://hostname:3306/schemaname .
	 */
	private static String URL;

	/*
	 * log4j logger will be used for logging purposes.
	 */
	// private static Logger dblogger = Logger.getLogger();

	/*
	 * static block to load database connection parameters from
	 * database.properties file.
	 */
	static {
		Properties p = new Properties();
		try {
			p.load(DbUtil.class.getClassLoader().getResourceAsStream("db.properties"));
			UNAME = p.getProperty("username");
			PWD = p.getProperty("password");
			URL = p.getProperty("url");
			DRIVER = p.getProperty("driver");
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// dblogger.error(DBConstants.DRIVER_LOAD_ERR_MSG);
		} catch (IOException e) {
			// dblogger.error(DBConstants.PROP_LOAD_ERR_MSG);
		}
	}

	public static Connection getConnection() throws DatabaseException {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(URL, UNAME, PWD);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DatabaseException("Not able to connect to database now plz try after some time");
		}
		return connection;
	}

	public static void closeConnection(Connection connection) throws DatabaseException {
		if (connection != null)
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DatabaseException("Not able to connect to database now plz try after some time");
			}
	}

	public static void main(String[] args) throws DatabaseException {
		System.out.println(getConnection());
	}

}
