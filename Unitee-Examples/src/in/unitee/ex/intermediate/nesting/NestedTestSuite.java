package in.unitee.ex.intermediate.nesting;

import com.autocognite.unitee.core.test.style.TestSuite;

import in.unitee.ex.basic.SimpleTestCase;
import in.unitee.ex.basic.SimpleTestCaseFail;
import in.unitee.ex.basic.SimpleTestMethodSuite;
import in.unitee.ex.basic.ddt.TabDelimFileDDTestSuite;
import in.unitee.ex.intermediate.suite.CustomTestSuite1;
import in.unitee.ex.intermediate.suite.CustomTestSuite2;

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
