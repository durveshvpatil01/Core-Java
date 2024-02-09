package com.edubridge.customexceptiondemo;

@SuppressWarnings("serial")
public class LogicalCredentials extends Exception{
//for error message
	private String str;

	public LogicalCredentials(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "LogicalCredentials [str=" + str + "]";
	}
	
	
}
