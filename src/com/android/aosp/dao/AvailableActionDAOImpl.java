package com.android.aosp.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AvailableActionDAOImpl extends BaseDAO implements AvailableActionDAO{

	static final String SELECT_ALL_AVAILABLE_ACTION = "select `role_name` from `role`";
	@Override
	public List<String> searchAvailableAction() throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement pstmt = getConnection().prepareStatement(SELECT_ALL_AVAILABLE_ACTION);
		ResultSet rs = pstmt.executeQuery();
		ArrayList<String> actionList = new ArrayList<String>();
		while(rs.next()) {
			actionList.add(rs.getString(1));
		}
		return actionList;
	}

}
