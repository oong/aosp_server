package com.android.aosp.action;

import java.sql.SQLException;
import java.util.List;

import com.android.aosp.dao.AvailableActionDAO;
import com.android.aosp.dao.DAOFactory;
import com.android.aosp.dao.Factory;

public class AvailableActingAction {
	public List<String> getAvailableAction() throws SQLException {
		Factory factory = DAOFactory.getInstance();
		AvailableActionDAO actionDAO = (AvailableActionDAO) factory.getObject(DAOFactory.NAME_AVAILABLE_ACION_DAO);
		List<String> actionList = actionDAO.searchAvailableAction();
		return actionList;
	}
}
