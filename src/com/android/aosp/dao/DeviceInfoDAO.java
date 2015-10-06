package com.android.aosp.dao;

import java.sql.SQLException;

import com.android.aosp.dto.DeviceInfoDTO;

public interface DeviceInfoDAO {
	int insertDeviceInfo(DeviceInfoDTO info) throws SQLException;
	DeviceInfoDTO searchDeviceInfo(String modelName) throws SQLException;
	DeviceInfoDTO searchDeviceInfo(int modelIdx) throws SQLException;
	int removeDeviceInfo(String modelName) throws SQLException;
	int removeDeviceInfo(int modelIdx) throws SQLException;
	int modifyDeviceInfo(String targetModelName, DeviceInfoDTO newInfo) throws SQLException;
	int modifyDeviceInfo(int targetModelIdx, DeviceInfoDTO newInfo) throws SQLException;
}	
