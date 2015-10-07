package com.android.aosp.vo;

public class InputProtocol {
	
	static final int VALUEFORM_IS_NOT_VALUE = 9;
	private int type;
	private String typeLabel;
	private int code;
	private String codeLabel;
	private int valueForm;
	public InputProtocol(int type, String typeLabel, int code, String codeLabel, int valueForm) {
		super();
		this.type = type;
		this.typeLabel = typeLabel;
		this.code = code;
		this.codeLabel = codeLabel;
		this.valueForm = valueForm;
	}
	@Override
	public String toString() {
		return "InputProtocol [type=" + type + ", typeLabel=" + typeLabel + ", code=" + code + ", codeLabel="
				+ codeLabel + ", valueForm=" + valueForm + "]";
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
	public int getValueForm() {
		return valueForm;
	}
	public void setValueForm(int valueForm) {
		this.valueForm = valueForm;
	}
	public static int getValueformIsNotValue() {
		return VALUEFORM_IS_NOT_VALUE;
	}
	
	
}
