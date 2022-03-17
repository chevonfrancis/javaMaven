package com.qa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestConnection {
	
	public static final Logger LOGGER = LogManager.getLogger();
	
//	three things we need to connect 
	private String connectionURL = "jdbc:mysql://localhost:3306/persondb";
	private String username = "root";
	private String password = "root";
	 
	public void testConnection() {
		Connection conn = null;
//		LOGGER.info == system.out.println
		try {
			System.out.println("Attempting DB connection...");
			conn = DriverManager.getConnection(connectionURL, username, password);
			System.out.println("Connection Successful");
//			this catches all the connection fails that will happen if trying to login SQL with this exception
		} catch (SQLException se) {
			System.out.println(se.getMessage());
//			this catches all fail errors regardless with this exception
//		} catch (Exception e) {
//			LOGGER.error(e.getMessage());	
		} finally {
//			close throws an exception because the application might not close so we have to add try and catch exception
			try {
				if (conn != null) {
					System.out.println("Attempting to close connection...");
			conn.close();
			System.out.println("Closed connection.");
			}
		} catch (SQLException se) {
			LOGGER.error(se.getMessage());
		}
		}	
}

	}

