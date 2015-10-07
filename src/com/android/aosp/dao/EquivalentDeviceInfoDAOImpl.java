package com.android.aosp.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.android.aosp.dto.EquivalentDeviceInfoDTO;
import com.android.aosp.dto.InputProtocolDTO;

public class EquivalentDeviceInfoDAOImpl extends BaseDAO implements EquivalentDeviceInfoDAO {

	static final String SELECT_SQL = ""
		+ "SELECT "
			+ "man.manufacturer_name,"
			+ "mo.model_name,"
			+ "input_dev.input_device_name,"
			+ "act.action_name,"
			+ "input_prot.type,"
			+ "input_prot.type_label,"
			+ "input_prot.code,"
			+ "input_prot.code_label,"
			+ "input_prot.value,"
			+ "rol.role_name "
		+ "FROM"
		+ "`manufacturer` man "
			+ "LEFT JOIN "
			+ "`model` mo ON mo.`manufacturer_idx` = man.`manufacturer_idx` "
			+ "LEFT JOIN "
			+ "`input_device` input_dev ON input_dev.`model_idx` = mo.`model_idx` "
			+ "LEFT JOIN "
			+ "`device_action_protocol` dev_act_prot ON input_dev.`input_device_idx` = dev_act_prot.`input_device_idx` "
			+ "LEFT JOIN "
			+ "`action` act ON act.action_idx = dev_act_prot.`action_idx` "
			+ "LEFT JOIN "
			+ "`input_protocol` input_prot ON dev_act_prot.`input_protocol_idx` = input_prot.`input_protocol_idx` "
			+ "LEFT JOIN "
			+ "`role` rol ON rol.`role_idx` = dev_act_prot.`role_idx` "
			+ "WHERE "
			+ "man.`manufacturer_name` = ? "
			+ "AND mo.`model_name` = ? "
			+ "AND rol.role_name = ? ";
		        
	
	@Override
	public List<EquivalentDeviceInfoDTO> searchEquivalentDeviceInfo(String manufacturerName, String modelName)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EquivalentDeviceInfoDTO> searchEquivalentDeviceInfo(String manufacturerName, String modelName ,String role) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement pstmt = getConnection().prepareStatement(SELECT_SQL);
		pstmt.setString(1, manufacturerName); pstmt.setString(2, modelName); pstmt.setString(3, role);
		ResultSet rs = pstmt.executeQuery();
		
		List<EquivalentDeviceInfoDTO> eqDeviceInfoDTOList = new ArrayList<EquivalentDeviceInfoDTO>();
		while(rs.next()) {
			String _manufacturerName = rs.getString(1);
			String _modelName = rs.getString(2);
			String inputDeviceName = rs.getString(3);
			String actionName = rs.getString(4);
			int type = rs.getInt(5);
			String typeLabel = rs.getString(6);
			int code = rs.getInt(7);
			String codeLabel = rs.getString(8);
			int value = rs.getInt(9);
			String roleName = rs.getString(10);
			eqDeviceInfoDTOList.add(
					new EquivalentDeviceInfoDTO(
							_manufacturerName, _modelName, inputDeviceName, actionName, roleName, new InputProtocolDTO(type, typeLabel, code, codeLabel, value))
			);
		}
		return eqDeviceInfoDTOList;
	}

	@Override
	public int insertEquivalentDeviceInfo(List<EquivalentDeviceInfoDTO> eqDeviceInfoList) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeEquivalentDeviceInfo(String manufacturerName, String modelName) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyEquivalentDeviceInfo(String targetManufacturerName, String targetModelName,
			List<EquivalentDeviceInfoDTO> eqDeviceInfoList) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
