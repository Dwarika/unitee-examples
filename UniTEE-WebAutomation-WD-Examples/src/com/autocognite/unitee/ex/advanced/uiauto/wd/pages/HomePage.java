package com.autocognite.unitee.ex.advanced.uiauto.wd.pages;

import com.autocognite.unitee.ex.advanced.uiauto.wd.config.WPConfiguration;
import com.autocognite.unitee.lib.config.RunConfiguration;
import com.autocognite.unitee.lib.uiauto.iface.IUiElementAutomator;

public class HomePage extends BasePage {
	public HomePage(RunConfiguration config, IUiElementAutomator automator) throws Exception{
		super(config, automator);
		goToBaseUrl();
	}
	
	public void goToBaseUrl() throws Exception{
		uiElementAutomator.goTo(WPConfiguration.INSTANCE.getLoginUrl());		
	}
	
	public DashBoard login() throws Exception{
		element("LOGIN").identify().enterText("user");
		element("PASSWORD").identify().enterText("bitnami");
		element("SUBMIT").identify().click();
		System.out.println("Creating dashboard");
		DashBoard dashboard = new DashBoard(runConfig, uiElementAutomator);
		System.out.println("Creating dashboard done");
		return dashboard;
	}
	
	public TopMenu getTopMenu() throws Exception{
		throw new Exception("Top Menu is not available on Home Page.");
	}
	
	public LeftNavigation getLeftNavigation() throws Exception{
		throw new Exception("Left Navigation bar is not available on Home Page.");
	}
}
