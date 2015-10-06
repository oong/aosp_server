package com.android.aosp.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.android.aosp.dto.DeviceInfoDTO;

public class DeviceInfoDAOImpl extends BaseDAO implements DeviceInfoDAO{
	
	
	static final String INSERT_SQL = "INSERT INTO `aosp`.`input_device_info`"
			+ " (`has_hw_navi_bar`, `device_name_for_touchscreen`,"
			+ "`device_name_for_backbutton`, `device_name_for_homebutton`,"
			+ "`device_name_for_menubutton`) "
			+ "VALUES (?, ?, ?, ?, ?)";
	
	static final String SELECT_SQL_WITH_MODEL_NAME = "SELECT * from `aosp`.`input_device_info` info"
			+ " JOIN `model` model"
			+ " WHERE info.`model_idx` = model.`idx`"
			+ " AND model.`model_name` = ?";
	
	static final String SELECT_SQL_WITH_MODEL_INDEX = "SELECT * from `aosp`.`input_device_info` info"
			+ " JOIN `model` model"
			+ " WHERE info.`idx` = model.`idx`"
			+ " AND model.`idx` = ?";
	
	static final String COLUMN_NAME_IDX = "idx";
	static final String COLUMN_MODEL_NAME = "model_name";
	static final String COLUMN_NAME_HASNAVIBAR = "has_hw_navi_bar";
	static final String COLUMN_NAME_DEVICE_TOUCHSCREEN = "device_name_for_touchscreen";
	static final String COLUMN_NAME_DEVICE_BACKBUTTON = "device_name_for_backbutton";
	static final String COLUMN_NAME_DEVICE_HOMEBUTTON = "device_name_for_homebutton";
	static final String COLUMN_NAME_DEVICE_MENUBUTTON = "device_name_for_menubutton";
	
	public DeviceInfoDAOImpl() {
		// TODO Auto-generated constructor stub
		super();
	}
	@Override
	public int insertDeviceInfo(DeviceInfoDTO info) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement pstmt = getConnection().prepareStatement(INSERT_SQL);
		pstmt.setBoolean(1, info.isHasHWNaviBar());
		pstmt.setString(2, info.getScreenTouchDevice());
		pstmt.setString(3, info.getBackButtonDevice());
		pstmt.setString(4, info.getHomeButtonDevice());
		pstmt.setString(5, info.getMenuButtonDevice());
		int result = pstmt.executeUpdate();
		return result;
	}

	@Override
	public DeviceInfoDTO searchDeviceInfo(String modelName) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement pstmt = getConnection().prepareStatement(SELECT_SQL_WITH_MODEL_NAME);
		pstmt.setString(1, modelName);
		ResultSet rs = pstmt.executeQuery();
		DeviceInfoDTO dto = null;
		while(rs.next()) {
			int idx = rs.getInt(COLUMN_NAME_IDX);
			
			boolean hasHWNaviBar = rs.getInt(COLUMN_NAME_HASNAVIBAR) == 1 ? true : false;
			String _modelName = rs.getString(COLUMN_MODEL_NAME);
			String touchDeviceName = rs.getString(COLUMN_NAME_DEVICE_TOUCHSCREEN);
			String backButtonDeviceName = rs.getString(COLUMN_NAME_DEVICE_BACKBUTTON);
			String homeButtonDeviceName = rs.getString(COLUMN_NAME_DEVICE_HOMEBUTTON);
			String menuButtonDeviceName = rs.getString(COLUMN_NAME_DEVICE_MENUBUTTON);
			dto = new DeviceInfoDTO(idx, hasHWNaviBar, _modelName, touchDeviceName, backButtonDeviceName, homeButtonDeviceName, menuButtonDeviceName);
		}
		return dto;
		
	}

	@Override
	public DeviceInfoDTO searchDeviceInfo(int modelIdx) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement pstmt = getConnection().prepareStatement(SELECT_SQL_WITH_MODEL_INDEX);
		pstmt.setInt(1, modelIdx);
		ResultSet rs = pstmt.executeQuery();
		
		int idx = rs.getInt(COLUMN_NAME_IDX);
		boolean hasHWNaviBar = rs.getInt(COLUMN_NAME_HASNAVIBAR) == 1 ? true : false;
		String modelName = rs.getString(COLUMN_MODEL_NAME);
		String touchDeviceName = rs.getString(COLUMN_NAME_DEVICE_TOUCHSCREEN);
		String backButtonDeviceName = rs.getString(COLUMN_NAME_DEVICE_BACKBUTTON);
		String homeButtonDeviceName = rs.getString(COLUMN_NAME_DEVICE_HOMEBUTTON);
		String menuButtonDeviceName = rs.getString(COLUMN_NAME_DEVICE_MENUBUTTON);
		
		return new DeviceInfoDTO(idx, hasHWNaviBar, modelName, touchDeviceName, backButtonDeviceName, homeButtonDeviceName, menuButtonDeviceName);
	}

	@Override
	public int removeDeviceInfo(String modelName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeDeviceInfo(int modelIdx) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyDeviceInfo(String targetModelName, DeviceInfoDTO newInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyDeviceInfo(int targetModelIdx, DeviceInfoDTO newInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
