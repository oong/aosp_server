package com.android.aosp.dto;

public class BaseInputDeviceInfoDTO {
	protected String name;
	protected BaseRecordLogDTO start;
	protected BaseRecordLogDTO end;
	public BaseInputDeviceInfoDTO(String name, BaseRecordLogDTO start, BaseRecordLogDTO end) {
		super();
		this.name = name;
		this.start = start;
		this.end = end;
	}
	public BaseInputDeviceInfoDTO() {
		super();
	}
	@Override
	public String toString() {
		return "BaseInputDeviceInfoDTO [name=" + name + ", start=" + start + ", end=" + end + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BaseRecordLogDTO getStart() {
		return start;
	}
	public void setStart(BaseRecordLogDTO start) {
		this.start = start;
	}
	public BaseRecordLogDTO getEnd() {
		return end;
	}
	public void setEnd(BaseRecordLogDTO end) {
		this.end = end;
	}
	
	
}
