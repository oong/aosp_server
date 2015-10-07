package com.android.aosp.dao;

import java.sql.SQLException;
import java.util.List;

import com.android.aosp.dto.EquivalentDeviceInfoDTO;

public interface EquivalentDeviceInfoDAO {
	List<EquivalentDeviceInfoDTO> searchEquivalentDeviceInfo(String manufacturerName, String modelName) throws SQLException ;
	List<EquivalentDeviceInfoDTO> searchEquivalentDeviceInfo(String manufacturerName, String modelName, String role) throws SQLException ;
	int insertEquivalentDeviceInfo(List<EquivalentDeviceInfoDTO> eqDeviceInfoList) throws SQLException ;
	int removeEquivalentDeviceInfo(String manufacturerName, String modelName) throws SQLException ;
	int modifyEquivalentDeviceInfo(String targetManufacturerName, String targetModelName, List<EquivalentDeviceInfoDTO> eqDeviceInfoList) throws SQLException ;
}
