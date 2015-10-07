package com.android.aosp.action;

import java.sql.SQLException;
import java.util.Hashtable;
import java.util.List;

import com.android.aosp.dao.DAOFactory;
import com.android.aosp.dao.EquivalentDeviceInfoDAO;
import com.android.aosp.dao.Factory;
import com.android.aosp.dto.EquivalentDeviceInfoDTO;
import com.android.aosp.dto.InputProtocolDTO;
import com.android.aosp.vo.InputProtocol;

public class EquivalentDeivceInfoAction {
	public Hashtable<String, Hashtable<String, InputProtocol>> getEquivalentDeviceInfo(String manufacturerName, String modelName, String[] roleArray) throws SQLException {
		
		
		Factory factory = DAOFactory.getInstance();
		EquivalentDeviceInfoDAO dao = (EquivalentDeviceInfoDAO) factory.getObject(DAOFactory.NAME_EQDEVICE_INFO_DAO);
		int requestCount = roleArray.length;
		Hashtable<String, Hashtable<String, InputProtocol>> resultTable = new Hashtable<String, Hashtable<String, InputProtocol>>();
		for(int i=0;i<requestCount;i++) { 
			List<EquivalentDeviceInfoDTO> dtoList = dao.searchEquivalentDeviceInfo(manufacturerName, modelName, roleArray[i]);
			Hashtable<String, InputProtocol> actionProtocolTable = new Hashtable<String, InputProtocol>();
			for(EquivalentDeviceInfoDTO tempDTO : dtoList) {
				String actionName = tempDTO.getActionName();
				InputProtocolDTO ipDTO = tempDTO.getInputProtocol();
				InputProtocol inputProtocol = new InputProtocol(ipDTO.getType(), ipDTO.getTypeLabel(), ipDTO.getCode(), ipDTO.getCodeLabel(), ipDTO.getValue());
				actionProtocolTable.put(actionName, inputProtocol);
			}
			resultTable.put(roleArray[i], actionProtocolTable);
			//한바퀴 돌면 특정 역할값에 대한 action - protocol 목록이 담겨있는 hashtable 완성
		}
		return resultTable;
	}
}
