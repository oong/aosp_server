package com.android.aosp.db.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost/aosp";
	private static final String USER_ID = "root";
	private static final String USER_PASSWORD = "rlaxod2";
	
	
	private static DBConnection DB_CONNECTION;
	
	private Connection conn;
	
	public static DBConnection getInstance() {
		if(DB_CONNECTION == null) 
			DB_CONNECTION = new DBConnection();
		
		return DB_CONNECTION;
	}
	
	private DBConnection() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER_ID, USER_PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public Connection getConnection() {
		return conn;
	}
	
}
