package com.android.aosp.dao;

import java.sql.Connection;

import com.android.aosp.db.connection.DBConnection;

public abstract class BaseDAO {
	private Connection connection;
	protected BaseDAO() {
		connection = DBConnection.getInstance().getConnection();
	}
	Connection getConnection() {
		return connection;
	}
	
}
