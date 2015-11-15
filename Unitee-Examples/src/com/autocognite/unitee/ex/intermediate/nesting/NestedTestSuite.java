package com.autocognite.unitee.ex.intermediate.nesting;

import com.autocognite.unitee.ex.basic.ddt.TabDelimFileDDTestSuite;
import com.autocognite.unitee.ex.basic.test.SimpleTestCase;
import com.autocognite.unitee.ex.basic.test.SimpleTestCaseFail;
import com.autocognite.unitee.ex.basic.test.SimpleTestMethodSuite;
import com.autocognite.unitee.ex.intermediate.suite.CustomTestSuite1;
import com.autocognite.unitee.ex.intermediate.suite.CustomTestSuite2;
import com.autocognite.unitee.lib.test.TestSuite;

public class NestedTestSuite extends TestSuite{
	
	public void init(){
		add(new CustomTestSuite1());
		add(new CustomTestSuite2());
		
		add(new SimpleTestCase());
		add(new SimpleTestCaseFail());
		
		add(new SimpleTestMethodSuite());
		add(new TabDelimFileDDTestSuite());
	}

}
