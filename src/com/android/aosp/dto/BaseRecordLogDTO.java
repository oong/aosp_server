package com.android.aosp.dto;

public class BaseRecordLogDTO {
	private int type;
	private int code;
	private int value;
	public BaseRecordLogDTO(int type, int code, int value) {
		super();
		this.type = type;
		this.code = code;
		this.value = value;
	}
	public BaseRecordLogDTO() {
		super();
	}
	@Override
	public String toString() {
		return "BaseRecordLogDTO [type=" + type + ", code=" + code + ", value=" + value + "]";
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}
