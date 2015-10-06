package com.android.aosp.vo;

import java.io.Serializable;

public class DeviceInfoVO implements Serializable{
	
	private static final long serialVersionUID = 3912068929326487677L;
	
	private boolean hasHWNaviBar;
	private String modelName;
	private String touchDevice;
	private String backButtonDevice;
	private String homebuttonDevice;
	private String menuButtonDevice;
	
	public DeviceInfoVO(boolean hasHWNaviBar, String modelName, String touchDevice, String backButtonDevice,
			String homebuttonDevice, String menuButtonDevice) {
		super();
		this.hasHWNaviBar = hasHWNaviBar;
		this.modelName = modelName;
		this.touchDevice = touchDevice;
		this.backButtonDevice = backButtonDevice;
		this.homebuttonDevice = homebuttonDevice;
		this.menuButtonDevice = menuButtonDevice;
	}

	public DeviceInfoVO() {
		super();
	}

	@Override
	public String toString() {
		return "DeviceInfoVO [hasHWNaviBar=" + hasHWNaviBar + ", modelName=" + modelName + ", touchDevice="
				+ touchDevice + ", backButtonDevice=" + backButtonDevice + ", homebuttonDevice=" + homebuttonDevice
				+ ", menuButtonDevice=" + menuButtonDevice + "]";
	}

	public boolean isHasHWNaviBar() {
		return hasHWNaviBar;
	}

	public void setHasHWNaviBar(boolean hasHWNaviBar) {
		this.hasHWNaviBar = hasHWNaviBar;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getTouchDevice() {
		return touchDevice;
	}

	public void setTouchDevice(String touchDevice) {
		this.touchDevice = touchDevice;
	}

	public String getBackButtonDevice() {
		return backButtonDevice;
	}

	public void setBackButtonDevice(String backButtonDevice) {
		this.backButtonDevice = backButtonDevice;
	}

	public String getHomebuttonDevice() {
		return homebuttonDevice;
	}

	public void setHomebuttonDevice(String homebuttonDevice) {
		this.homebuttonDevice = homebuttonDevice;
	}

	public String getMenuButtonDevice() {
		return menuButtonDevice;
	}

	public void setMenuButtonDevice(String menuButtonDevice) {
		this.menuButtonDevice = menuButtonDevice;
	}
	
}
