package com.autocognite.unitee.ex.advanced.uiauto.wd.pages;

import com.autocognite.unitee.lib.config.RunConfiguration;
import com.autocognite.unitee.lib.uiauto.*;
import com.autocognite.unitee.lib.uiauto.iface.*;

public class BasePage extends UiElementEntity {
	TopMenu topMenu = null;
	LeftNavigation leftNavigation = null;
	
	private String getIniMapFilePath(){
		return runConfig.getUiMapsDir()  + "/wordpress" + "/" + getName() + ".ini";
	}
	
	public BasePage(RunConfiguration config, IUiElementAutomator automator) throws Exception{
		super(config, automator);
		IUiElementMapper mapper = FileUiElementMapperFactory.getMapper("INI", getName(), getIniMapFilePath());
		populate(mapper);
	}
		
	public TopMenu getTopMenu() throws Exception{
		if (topMenu == null){
			return new TopMenu(runConfig, uiElementAutomator);
		} else {
			return topMenu;
		}
	}
	
	public LeftNavigation getLeftNavigation() throws Exception{
		if (leftNavigation == null){
			return new LeftNavigation(runConfig, uiElementAutomator);
		} else {
			return leftNavigation;
		}
	}
}