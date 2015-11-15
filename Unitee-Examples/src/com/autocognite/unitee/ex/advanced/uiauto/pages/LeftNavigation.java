package com.autocognite.unitee.ex.advanced.uiauto.pages;

import com.autocognite.unitee.lib.config.RunConfiguration;
import com.autocognite.unitee.lib.uiauto.iface.IUiElementAutomator;

public class LeftNavigation extends BasePage {
	public LeftNavigation (RunConfiguration config, IUiElementAutomator uiElementAutomator) throws Exception{
		super(config, uiElementAutomator);
	}
	
	public Settings getSettingsPage() throws Exception {
		element("SETTINGS").click();
		Settings settings = new Settings(runConfig, uiElementAutomator);
		return settings;
	}
}
