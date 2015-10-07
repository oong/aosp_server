package com.android.aosp.dto;

public class InputProtocolDTO {
	private int type;
	private String typeLabel;
	private int code;
	private String codeLabel;
	private int value;
	public InputProtocolDTO(int type, String typeLabel, int code, String codeLabel, int value) {
		super();
		this.type = type;
		this.typeLabel = typeLabel;
		this.code = code;
		this.codeLabel = codeLabel;
		this.value = value;
	}
	public InputProtocolDTO() {
		super();
	}
	@Override
	public String toString() {
		return "InputProtocolDTO [type=" + type + ", typeLabel=" + typeLabel + ", code=" + code + ", codeLabel="
				+ codeLabel + ", value=" + value + "]";
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getTypeLabel() {
		return typeLabel;
	}
	public void setTypeLabel(String typeLabel) {
		this.typeLabel = typeLabel;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getCodeLabel() {
		return codeLabel;
	}
	public void setCodeLabel(String codeLabel) {
		this.codeLabel = codeLabel;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	
}
