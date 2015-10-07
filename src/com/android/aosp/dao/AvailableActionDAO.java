package com.android.aosp.dao;

import java.sql.SQLException;
import java.util.List;

public interface AvailableActionDAO {
	List<String> searchAvailableAction() throws SQLException;
}
