package in.unitee.ex.nesting;

import in.unitee.ex.basic.SimpleDDTestSuite;
import in.unitee.ex.basic.SimpleTestCase;
import in.unitee.ex.basic.SimpleTestCaseFail;
import in.unitee.ex.basic.SimpleTestMethodSuite;
import in.unitee.ex.suite.CustomTestSuite1;
import in.unitee.ex.suite.CustomTestSuite2;
import in.unitee.lib.test.TestSuite;

public class NestedTestSuite extends TestSuite{
	
	public void init(){
		add(new CustomTestSuite1());
		add(new CustomTestSuite2());
		
		add(new SimpleTestCase());
		add(new SimpleTestCaseFail());
		
		add(new SimpleTestMethodSuite());
		add(new SimpleDDTestSuite());
	}

}
