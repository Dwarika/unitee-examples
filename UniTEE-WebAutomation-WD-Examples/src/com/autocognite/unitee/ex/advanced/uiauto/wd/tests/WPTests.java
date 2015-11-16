package com.autocognite.unitee.ex.advanced.uiauto.wd.tests;

import com.autocognite.unitee.lib.support.webdriver.WDUiElementAutomator;
import com.autocognite.unitee.ex.advanced.uiauto.wd.pages.*;
import com.autocognite.unitee.lib.test.TestMethodSuite;
import com.autocognite.unitee.lib.uiauto.iface.IUiElementAutomator;
import static com.autocognite.unitee.lib.validator.Assertions.*;

public class WPTests extends TestMethodSuite {
	private IUiElementAutomator automator = null;
	DashBoard dashboard = null;
	
	public void init(){
	}
	
	public void setUpClass() throws Exception{
		automator = new WDUiElementAutomator(runConfig);
	}

	public void testLoginLogout() throws Exception{
		// Sleep time used here for demo purpose to help you in seeing what's happening.
		// Shouldn't be used it in real code.
		HomePage home = new HomePage(this.runConfig, this.automator);
		dashboard = home.login();
		LeftNavigation left = dashboard.getLeftNavigation();
		left.element("POSTS").identify().hoverAndClickElement(left.element("CATEGORIES"));
		Categories categories = new Categories(runConfig, automator);
		categories.element("CAT_CHECKBOXES").identifyAll().getInstanceAtOrdinal(2).check();
		Thread.sleep(2000);
		categories.element("CAT_CHECKBOXES").getInstanceAtOrdinal(2).unCheck();
		
		Settings settings = left.getSettingsPage();
		settings.element("BLOG_NAME").identify().enterText("Hello");
		Thread.sleep(2000);
		settings.element("BLOG_NAME").identify().enterText("Hello");
		Thread.sleep(2000);
		settings.element("BLOG_NAME").identify().setText("Hello");
		
		settings.element("MEMBERSHIP").identify().check();

		// Experiments with Select control - Selection using different attributes
		settings.element("ROLE").identify().selectLabel("Author");
		assertTrue(settings.element("ROLE").hasSelectedLabel("Author"));
		Thread.sleep(2000);
		settings.element("ROLE").identify().selectIndex(0);
		assertTrue(settings.element("ROLE").hasSelectedIndex(0));
		Thread.sleep(2000);
		settings.element("ROLE").identify().selectValue("author");
		assertTrue(settings.element("ROLE").hasSelectedValue("author"));
		
		// Experiments with Radio Button
		settings.element("DATE_FORMAT").identify().selectLabel("11/16/2015");
		assertTrue(settings.element("DATE_FORMAT").hasSelectedLabel("11/16/2015"));
		Thread.sleep(2000);
		settings.element("DATE_FORMAT").identify().selectIndex(0);
		assertTrue(settings.element("DATE_FORMAT").hasSelectedIndex(0));
		Thread.sleep(2000);
		settings.element("DATE_FORMAT").identify().selectValue("m/d/Y");
		assertTrue(settings.element("DATE_FORMAT").hasSelectedValue("m/d/Y"));
	}
	
	public void tearDownClass() throws Exception{
		System.out.println("Executing tear down class.");
		try{
			dashboard.getTopMenu().logout();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Now closing browser");
		automator.close();
		System.out.println("browser closed");
	}
}
