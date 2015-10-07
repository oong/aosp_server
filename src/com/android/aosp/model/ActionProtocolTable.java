package com.android.aosp.model;

import java.util.Hashtable;

import com.android.aosp.vo.InputProtocol;

public class ActionProtocolTable {
	private Hashtable<String, InputProtocol> mTable;

	public ActionProtocolTable(Hashtable<String, InputProtocol> mTable) {
		this.mTable = mTable;
	}

	public ActionProtocolTable() {
		super();
	}

	@Override
	public String toString() {
		return "ActionProtocolTable [mTable=" + mTable + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public Hashtable<String, InputProtocol> getmTable() {
		return mTable;
	}

	public void setmTable(Hashtable<String, InputProtocol> mTable) {
		this.mTable = mTable;
	}
}
