package com.autocognite.unitee.ex.intermediate.suite;

import com.autocognite.unitee.ex.basic.ddt.TabDelimFileDDTestSuite;
import com.autocognite.unitee.ex.basic.test.SimpleTestMethodSuite;
import com.autocognite.unitee.lib.test.TestSuite;

public class CustomTestSuite2 extends TestSuite{

	public void init(){
		add(new SimpleTestMethodSuite());
		add(new TabDelimFileDDTestSuite());
	}
}
