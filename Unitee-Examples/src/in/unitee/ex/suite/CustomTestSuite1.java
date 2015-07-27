package in.unitee.ex.suite;

import in.unitee.ex.basic.SimpleTestCase;
import in.unitee.ex.basic.SimpleTestCaseFail;
import in.unitee.lib.test.TestSuite;

public class CustomTestSuite1 extends TestSuite{

	public void init(){
		add(new SimpleTestCase());
		add(new SimpleTestCaseFail());
	}
}
