package com.android.aosp.dto;

public class TouchDeviceInfoDTO extends BaseInputDeviceInfoDTO{
	private BaseRecordLogDTO x;
	private BaseRecordLogDTO y;
	public TouchDeviceInfoDTO(String name, BaseRecordLogDTO start, BaseRecordLogDTO end, BaseRecordLogDTO x,
			BaseRecordLogDTO y) {
		super(name, start, end);
		this.x = x;
		this.y = y;
	}
	public TouchDeviceInfoDTO(String name, BaseRecordLogDTO start, BaseRecordLogDTO end) {
		super(name, start, end);
	}
	@Override
	public String toString() {
		return "TouchDeviceInfoDTO [x=" + x + ", y=" + y + ", name=" + name + ", start=" + start + ", end=" + end
				+ ", toString()=" + super.toString() + ", getName()=" + getName() + ", getStart()=" + getStart()
				+ ", getEnd()=" + getEnd() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	public BaseRecordLogDTO getX() {
		return x;
	}
	public void setX(BaseRecordLogDTO x) {
		this.x = x;
	}
	public BaseRecordLogDTO getY() {
		return y;
	}
	public void setY(BaseRecordLogDTO y) {
		this.y = y;
	}
}
