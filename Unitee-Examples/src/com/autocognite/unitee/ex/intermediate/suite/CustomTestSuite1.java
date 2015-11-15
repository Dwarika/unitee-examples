package com.autocognite.unitee.ex.intermediate.suite;

import com.autocognite.unitee.ex.basic.test.SimpleTestCase;
import com.autocognite.unitee.ex.basic.test.SimpleTestCaseFail;
import com.autocognite.unitee.lib.test.TestSuite;

public class CustomTestSuite1 extends TestSuite{

	public void init(){
		add(new SimpleTestCase());
		add(new SimpleTestCaseFail());
	}
}
