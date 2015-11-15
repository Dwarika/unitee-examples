package in.unitee.ex.intermediate.suite;

import com.autocognite.unitee.core.test.style.TestSuite;

import in.unitee.ex.basic.SimpleTestCase;
import in.unitee.ex.basic.SimpleTestCaseFail;

public class CustomTestSuite1 extends TestSuite{

	public void init(){
		add(new SimpleTestCase());
		add(new SimpleTestCaseFail());
	}
}
