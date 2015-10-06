package com.android.aosp.dto;

public class DeviceInfoDTO {
	private int index;
	
	private boolean hasHWNaviBar;
	private String modelName;
	private String screenTouchDevice;
	private String backButtonDevice;
	private String homeButtonDevice;
	private String menuButtonDevice;
	public DeviceInfoDTO(int index, boolean hasHWNaviBar, String modelName, String screenTouchDevice,
			String backButtonDevice, String homeButtonDevice, String menuButtonDevice) {
		super();
		this.index = index;
		this.hasHWNaviBar = hasHWNaviBar;
		this.modelName = modelName;
		this.screenTouchDevice = screenTouchDevice;
		this.backButtonDevice = backButtonDevice;
		this.homeButtonDevice = homeButtonDevice;
		this.menuButtonDevice = menuButtonDevice;
	}
	@Override
	public String toString() {
		return "DeviceInfoDTO [index=" + index + ", hasHWNaviBar=" + hasHWNaviBar + ", modelName=" + modelName
				+ ", screenTouchDevice=" + screenTouchDevice + ", backButtonDevice=" + backButtonDevice
				+ ", homeButtonDevice=" + homeButtonDevice + ", menuButtonDevice=" + menuButtonDevice + "]";
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
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
	public String getScreenTouchDevice() {
		return screenTouchDevice;
	}
	public void setScreenTouchDevice(String screenTouchDevice) {
		this.screenTouchDevice = screenTouchDevice;
	}
	public String getBackButtonDevice() {
		return backButtonDevice;
	}
	public void setBackButtonDevice(String backButtonDevice) {
		this.backButtonDevice = backButtonDevice;
	}
	public String getHomeButtonDevice() {
		return homeButtonDevice;
	}
	public void setHomeButtonDevice(String homeButtonDevice) {
		this.homeButtonDevice = homeButtonDevice;
	}
	public String getMenuButtonDevice() {
		return menuButtonDevice;
	}
	public void setMenuButtonDevice(String menuButtonDevice) {
		this.menuButtonDevice = menuButtonDevice;
	}
	
	
}
