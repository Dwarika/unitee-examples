package in.unitee.ex.suite;

import in.unitee.ex.basic.SimpleDDTestSuite;
import in.unitee.ex.basic.SimpleTestMethodSuite;
import in.unitee.lib.test.TestSuite;

public class CustomTestSuite2 extends TestSuite{

	public void init(){
		add(new SimpleTestMethodSuite());
		add(new SimpleDDTestSuite());
	}
}
