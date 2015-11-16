package com.autocognite.unitee.ex.advanced.uiauto.wd.pages;

import com.autocognite.unitee.lib.config.RunConfiguration;
import com.autocognite.unitee.lib.uiauto.iface.IUiElementAutomator;

public class TopMenu extends BasePage {
	public TopMenu (RunConfiguration config, IUiElementAutomator automator) throws Exception{
		super(config, automator);
	}
	
	public void logout() throws Exception {
		element("PROFILE_LINK").identify().hoverAndClickElement(element("LOGOUT_LINK"));
	}
}