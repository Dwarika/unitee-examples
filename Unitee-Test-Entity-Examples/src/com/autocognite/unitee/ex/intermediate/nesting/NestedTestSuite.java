package com.autocognite.unitee.ex.intermediate.nesting;

import com.autocognite.unitee.ex.basic.test.*;
import com.autocognite.unitee.ex.intermediate.suite.*;
import com.autocognite.unitee.lib.test.TestSuite;

public class NestedTestSuite extends TestSuite{
	
	public void init(){
		add(new CustomTestSuite());
		
		add(new SimpleTestCase());
		add(new SimpleTestCaseFail());
		
		add(new SimpleTestMethodSuite());
	}

}
