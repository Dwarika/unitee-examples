package com.autocognite.unitee.ex.advanced.uiauto.config;

public enum WPConfiguration {
	INSTANCE;
	String appUrl = "http://192.168.56.102";
	String loginUrl = appUrl + "/wp-admin/";
	String logoutUrl = null;
	
	public String getLoginUrl(){
		return loginUrl;
	}
	
	public String getLogoutUrl(){
		return logoutUrl;
	}
}
