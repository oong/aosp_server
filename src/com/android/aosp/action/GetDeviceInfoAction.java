package com.android.aosp.action;

import java.sql.SQLException;

import com.android.aosp.dao.DAOFactory;
import com.android.aosp.dao.DeviceInfoDAO;
import com.android.aosp.dao.Factory;
import com.android.aosp.dto.DeviceInfoDTO;
import com.android.aosp.vo.DeviceInfoVO;

public class GetDeviceInfoAction {
	public DeviceInfoVO getDeviceInfo(String modelName) throws SQLException {
		Factory factory = DAOFactory.getInstance();
		DeviceInfoDAO dao = (DeviceInfoDAO) factory.getObject(DAOFactory.NAME_DEVICE_INFO_DAO);
		DeviceInfoDTO dto = dao.searchDeviceInfo(modelName);
		return new DeviceInfoVO(dto.isHasHWNaviBar(), dto.getModelName(), dto.getScreenTouchDevice(),
				dto.getBackButtonDevice(), dto.getHomeButtonDevice(), dto.getMenuButtonDevice());
	}
}
