package com.android.aosp.vo;

import java.util.HashMap;

import com.android.aosp.model.ActionProtocolTable;

public class EquivalentDeviceInfoVO {
	private String manufacturerName;
	private String modelName;
	private HashMap<String, ActionProtocolTable> roleActionProtocolTable;
	@Override
	public String toString() {
		return "EquivalentDeviceInfoVO [manufacturerName=" + manufacturerName + ", modelName=" + modelName
				+ ", roleActionProtocolTable=" + roleActionProtocolTable + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public EquivalentDeviceInfoVO(String manufacturerName, String modelName,
			HashMap<String, ActionProtocolTable> roleActionProtocolTable) {
		super();
		this.manufacturerName = manufacturerName;
		this.modelName = modelName;
		this.roleActionProtocolTable = roleActionProtocolTable;
	}
	public EquivalentDeviceInfoVO() {
		super();
	}
	public String getManufacturerName() {
		return manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public HashMap<String, ActionProtocolTable> getRoleActionProtocolTable() {
		return roleActionProtocolTable;
	}
	public void setRoleActionProtocolTable(HashMap<String, ActionProtocolTable> roleActionProtocolTable) {
		this.roleActionProtocolTable = roleActionProtocolTable;
	}
	
	
	
}
