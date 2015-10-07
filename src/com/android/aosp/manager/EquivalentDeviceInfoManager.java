package com.android.aosp.manager;

import java.sql.SQLException;
import java.util.Hashtable;
import java.util.List;

import com.android.aosp.action.AvailableActingAction;
import com.android.aosp.action.EquivalentDeivceInfoAction;
import com.android.aosp.vo.AvailableAction;
import com.android.aosp.vo.InputProtocol;

public class EquivalentDeviceInfoManager {
	public Hashtable<String, Hashtable<String, InputProtocol>> getEQDeviceInfo(String manufacturerName, String modelName) throws SQLException {
		
		//get AvailableActionRole List
		List<String> availableActionList = new AvailableActingAction().getAvailableAction();
		String[] roleArray = availableActionList.toArray(new String[availableActionList.size()]);
		
		//get resultTable
		Hashtable<String, Hashtable<String, InputProtocol>> resultTable = new EquivalentDeivceInfoAction().getEquivalentDeviceInfo(manufacturerName, modelName, roleArray);
		for(int i=0;i<roleArray.length;i++) {
			Hashtable<String, InputProtocol> actionProtocolTable = resultTable.get(roleArray[i]);
			resultTable.put(roleArray[i], actionProtocolTable);
		}
		return resultTable;
	}
}
