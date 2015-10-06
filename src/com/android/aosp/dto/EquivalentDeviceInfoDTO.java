package com.android.aosp.dto;

public class EquivalentDeviceInfoDTO {
	private String modelName;
	private boolean hasHWNaviBar;
	private TouchDeviceInfoDTO touchScreenDevice;
	private BaseInputDeviceInfoDTO backButtonDevice;
	private BaseInputDeviceInfoDTO homeButtonDevice;
	private BaseInputDeviceInfoDTO menuButtonDevice;
	
	public EquivalentDeviceInfoDTO(String modelName, boolean hasHWNaviBar, TouchDeviceInfoDTO touchScreenDevice,
			BaseInputDeviceInfoDTO backButtonDevice, BaseInputDeviceInfoDTO homeButtonDevice,
			BaseInputDeviceInfoDTO menuButtonDevice) {
		super();
		this.modelName = modelName;
		this.hasHWNaviBar = hasHWNaviBar;
		this.touchScreenDevice = touchScreenDevice;
		this.backButtonDevice = backButtonDevice;
		this.homeButtonDevice = homeButtonDevice;
		this.menuButtonDevice = menuButtonDevice;
	}

	@Override
	public String toString() {
		return "EquivalentDeviceInfoDTO [modelName=" + modelName + ", hasHWNaviBar=" + hasHWNaviBar
				+ ", touchScreenDevice=" + touchScreenDevice + ", backButtonDevice=" + backButtonDevice
				+ ", homeButtonDevice=" + homeButtonDevice + ", menuButtonDevice=" + menuButtonDevice + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public boolean isHasHWNaviBar() {
		return hasHWNaviBar;
	}

	public void setHasHWNaviBar(boolean hasHWNaviBar) {
		this.hasHWNaviBar = hasHWNaviBar;
	}

	public TouchDeviceInfoDTO getTouchScreenDevice() {
		return touchScreenDevice;
	}

	public void setTouchScreenDevice(TouchDeviceInfoDTO touchScreenDevice) {
		this.touchScreenDevice = touchScreenDevice;
	}

	public BaseInputDeviceInfoDTO getBackButtonDevice() {
		return backButtonDevice;
	}

	public void setBackButtonDevice(BaseInputDeviceInfoDTO backButtonDevice) {
		this.backButtonDevice = backButtonDevice;
	}

	public BaseInputDeviceInfoDTO getHomeButtonDevice() {
		return homeButtonDevice;
	}

	public void setHomeButtonDevice(BaseInputDeviceInfoDTO homeButtonDevice) {
		this.homeButtonDevice = homeButtonDevice;
	}

	public BaseInputDeviceInfoDTO getMenuButtonDevice() {
		return menuButtonDevice;
	}

	public void setMenuButtonDevice(BaseInputDeviceInfoDTO menuButtonDevice) {
		this.menuButtonDevice = menuButtonDevice;
	}
}
