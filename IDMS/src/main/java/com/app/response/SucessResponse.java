package com.app.response;

public class SucessResponse {
	
	String sucessMsg;
	int sucessCode;
	public String getSucessMsg() {
		return sucessMsg;
	}
	public void setSucessMsg(String sucessMsg) {
		this.sucessMsg = sucessMsg;
	}
	public int getSucessCode() {
		return sucessCode;
	}
	public void setSucessCode(int sucessCode) {
		this.sucessCode = sucessCode;
	}
	@Override
	public String toString() {
		return "SucessResponse [sucessMsg=" + sucessMsg + ", sucessCode=" + sucessCode + "]";
	}
	public SucessResponse() {
		super();
	}
	
	

}
