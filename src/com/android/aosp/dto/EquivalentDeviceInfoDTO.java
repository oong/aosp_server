package com.android.aosp.dto;

public class EquivalentDeviceInfoDTO {
	private String manufacturerName;
	private String modelName;
	private String deviceName;
	private String actionName;
	private String roleName;
	private InputProtocolDTO inputProtocol;
	public EquivalentDeviceInfoDTO(String manufacturerName, String modelName, String deviceName, String actionName,
			String roleName, InputProtocolDTO inputProtocol) {
		super();
		this.manufacturerName = manufacturerName;
		this.modelName = modelName;
		this.deviceName = deviceName;
		this.actionName = actionName;
		this.roleName = roleName;
		this.inputProtocol = inputProtocol;
	}
	public EquivalentDeviceInfoDTO() {
		super();
	}
	@Override
	public String toString() {
		return "EquivalentDeviceInfoDTO [manufacturerName=" + manufacturerName + ", modelName=" + modelName
				+ ", deviceName=" + deviceName + ", actionName=" + actionName + ", roleName=" + roleName
				+ ", inputProtocol=" + inputProtocol + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
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
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getActionName() {
		return actionName;
	}
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public InputProtocolDTO getInputProtocol() {
		return inputProtocol;
	}
	public void setInputProtocol(InputProtocolDTO inputProtocol) {
		this.inputProtocol = inputProtocol;
	}
	
	
	
}
