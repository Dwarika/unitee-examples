package com.autocognite.unitee.ex.advanced.uiauto.wd.config;

public enum WPConfiguration {
	INSTANCE;
	String appUrl = "http://192.168.1.138";
	String loginUrl = appUrl + "/wp-admin/";
	String logoutUrl = null;
	
	public String getLoginUrl(){
		return loginUrl;
	}
	
	public String getLogoutUrl(){
		return logoutUrl;
	}
}
